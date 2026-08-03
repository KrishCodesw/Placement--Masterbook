import java.util.concurrent.atomic.AtomicStampedReference;

public class LockFreeStack<T> {
    static class Node<T> {
        final T value;
        Node<T> next;

        Node(T val) {
            this.value = val;
        }
    }

    private final AtomicStampedReference<Node<T>> top = new AtomicStampedReference<>(null, 0);

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        int[] stamp = new int[1];
        Node<T> oldTop;
        do {
            oldTop = top.get(stamp);
            newNode.next = oldTop;
        } while (!top.compareAndSet(oldTop, newNode, stamp[0], stamp[0] + 1));
    }

    public T pop() {
        int[] stamp = new int[1];
        Node<T> oldTop;
        Node<T> newTop;
        do {
            oldTop = top.get(stamp);
            if (oldTop == null)
                return null;
            newTop = oldTop.next;
        } while (!top.compareAndSet(oldTop, newTop, stamp[0], stamp[0] + 1));
        return oldTop.value;
    }
}