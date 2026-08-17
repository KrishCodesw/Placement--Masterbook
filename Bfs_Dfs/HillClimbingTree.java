public class HillClimbingTree {

    static class Node {
        String name;
        int value;
        Node left;
        Node right;

        Node(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    static void hillClimbing(Node root) {

        Node current = root;

        while (current != null) {

            System.out.println(
                    "Current Node: " + current.name +
                            " | Value: " + current.value);

            if (current.left == null && current.right == null) {
                break;
            }

            Node best = current;

            // Check left child
            if (current.left != null &&
                    current.left.value > best.value) {

                best = current.left;
            }

            if (current.right != null &&
                    current.right.value > best.value) {

                best = current.right;
            }

            if (best == current) {
                break;
            }

            current = best;
        }

        System.out.println("\nFinal Node: " + current.name);
        System.out.println("Maximum Value: " + current.value);
    }

    public static void main(String[] args) {

        Node root = new Node("A", 10);

        root.left = new Node("B", 15);
        root.right = new Node("C", 12);

        root.left.left = new Node("D", 18);
        root.left.right = new Node("E", 14);

        root.right.left = new Node("F", 11);
        root.right.right = new Node("G", 20);

        hillClimbing(root);
    }
}