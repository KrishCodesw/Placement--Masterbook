import java.util.*;

public class InformedSearch {

    // Edge of the graph
    static class Edge {
        String node;
        int cost;

        Edge(String node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    // Node used in Priority Queue
    static class Node {
        String name;
        int g;                  // Actual cost from start
        int h;                  // Heuristic cost
        List<String> path;      // Path taken so far

        Node(String name, int g, int h, List<String> path) {
            this.name = name;
            this.g = g;
            this.h = h;
            this.path = path;
        }

        // f(n) for A*
        int f() {
            return g + h;
        }
    }

    static Map<String, List<Edge>> graph = new HashMap<>();
    static Map<String, Integer> heuristic = new HashMap<>();

    // Add edge
    static void addEdge(String from, String to, int cost) {
        graph.computeIfAbsent(from, k -> new ArrayList<>())
             .add(new Edge(to, cost));
    }

    // =========================================================
    // GREEDY BEST-FIRST SEARCH
    // =========================================================

    static void greedyBFS(String start, String goal) {

        System.out.println("\n=================================");
        System.out.println("   GREEDY BEST-FIRST SEARCH");
        System.out.println("=================================");

        // Greedy BFS uses only h(n)
        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(n -> n.h)
                );

        Set<String> visited = new HashSet<>();

        List<String> startPath = new ArrayList<>();
        startPath.add(start);

        pq.add(new Node(
                start,
                0,
                heuristic.get(start),
                startPath
        ));

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            if (visited.contains(current.name)) {
                continue;
            }

            visited.add(current.name);

            System.out.println(
                    "Visited: " + current.name +
                    " | h(n) = " + current.h
            );

            // Goal check
            if (current.name.equals(goal)) {

                System.out.println("\nGoal Found!");
                System.out.println("Path: " + current.path);
                System.out.println("Path Cost: " + current.g);

                return;
            }

            // Expand neighbours
            for (Edge edge :
                    graph.getOrDefault(
                            current.name,
                            new ArrayList<>())) {

                if (!visited.contains(edge.node)) {

                    List<String> newPath =
                            new ArrayList<>(current.path);

                    newPath.add(edge.node);

                    pq.add(new Node(
                            edge.node,
                            current.g + edge.cost,
                            heuristic.get(edge.node),
                            newPath
                    ));
                }
            }
        }

        System.out.println("Goal not found.");
    }

    // =========================================================
    // A* SEARCH
    // =========================================================

    static void aStar(String start, String goal) {

        System.out.println("\n=================================");
        System.out.println("             A* SEARCH");
        System.out.println("=================================");

        // A* uses f(n) = g(n) + h(n)
        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                        Comparator.comparingInt(Node::f)
                );

        Map<String, Integer> bestG = new HashMap<>();

        List<String> startPath = new ArrayList<>();
        startPath.add(start);

        pq.add(new Node(
                start,
                0,
                heuristic.get(start),
                startPath
        ));

        bestG.put(start, 0);

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            System.out.println(
                    "Visited: " + current.name +
                    " | g(n) = " + current.g +
                    " | h(n) = " + current.h +
                    " | f(n) = " + current.f()
            );

            // Goal check
            if (current.name.equals(goal)) {

                System.out.println("\nGoal Found!");
                System.out.println("Path: " + current.path);
                System.out.println("Path Cost: " + current.g);

                return;
            }

            // Expand neighbours
            for (Edge edge :
                    graph.getOrDefault(
                            current.name,
                            new ArrayList<>())) {

                int newG = current.g + edge.cost;

                // Check if this is a better path
                if (!bestG.containsKey(edge.node)
                        || newG < bestG.get(edge.node)) {

                    bestG.put(edge.node, newG);

                    List<String> newPath =
                            new ArrayList<>(current.path);

                    newPath.add(edge.node);

                    pq.add(new Node(
                            edge.node,
                            newG,
                            heuristic.get(edge.node),
                            newPath
                    ));
                }
            }
        }

        System.out.println("Goal not found.");
    }

    // =========================================================
    // MAIN
    // =========================================================

    public static void main(String[] args) {

        /*
                    A
                  /   \
                1       5
              /           \
             S             B
              \             \
               4             1
                \             \
                 C ----------- G
                       1
        */

        // Graph edges
        addEdge("S", "A", 1);
        addEdge("A", "B", 5);
        addEdge("B", "G", 1);

        addEdge("S", "C", 4);
        addEdge("C", "G", 1);

        // Heuristic values
        heuristic.put("S", 4);
        heuristic.put("A", 3);
        heuristic.put("B", 1);
        heuristic.put("C", 1);
        heuristic.put("G", 0);

        String start = "S";
        String goal = "G";

        // Run Greedy Best-First Search
        greedyBFS(start, goal);

        // Run A* Search
        aStar(start, goal);
    }
}