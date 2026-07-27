import java.util.Stack;

public class DFS {
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

        Stack<Node> q = new Stack<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node current = q.pop();
            System.out.println(current.value);

            if (current.right != null) {
                q.add(current.right);
            }

            if (current.left != null) {
                q.add(current.left);
            }

        }

    }
}
