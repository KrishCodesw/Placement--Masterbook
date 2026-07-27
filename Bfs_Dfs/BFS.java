import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    // visits all nodes before moving deeper
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        Node left = new Node(2);
        root.left = left;
        Node right = new Node(3);
        root.right = right;
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.println(current.value);

            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }

    }
}