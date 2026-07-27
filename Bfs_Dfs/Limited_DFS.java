
import java.util.Stack;

public class Limited_DFS {
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

    static class Pair {
        Node node;
        int level;

        public Pair(Node node, int level) {
            this.level = level;
            this.node = node;
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

        Stack<Pair> q = new Stack<>();
        int limit_level = 1;
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair current = q.pop();
            System.out.println(current.node.value);

            if (current.level < limit_level) {
                if (current.node.right != null) {
                    q.add(new Pair(current.node.right, current.level + 1));
                }

                if (current.node.left != null) {
                    q.add(new Pair(current.node.left, current.level + 1));
                }
            }

        }

    }
}
