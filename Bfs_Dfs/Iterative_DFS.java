
import java.util.Stack;

public class Iterative_DFS {
    public static class Node {
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

    public static boolean iterativeDepthFirstSearch(Node root, int target, int maxDepth) {
        for (int limitLevel = 0; limitLevel <= maxDepth; limitLevel++) {
            System.out.println("Searching with limit level" + limitLevel);
            Stack<Pair> q = new Stack<>();
            q.add(new Pair(root, 0));

            while (!q.isEmpty()) {
                Pair current = q.pop();
                System.out.println("Visited" + current.node.value);

                if (current.node.value == target) {
                    return true;
                }
                if (current.level < limitLevel) {
                    if (current.node.right != null) {
                        q.add(new Pair(current.node.right, current.level + 1));
                    }
                    if (current.node.left != null) {
                        q.add(new Pair(current.node.left, current.level + 1));
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int target = 6;
        int maxSearchDepth = 2;

        boolean found = iterativeDepthFirstSearch(root, target, maxSearchDepth);
        System.out.println("\n Result:" + target + (found ? " Found!" : " Not Found."));

    }
}
