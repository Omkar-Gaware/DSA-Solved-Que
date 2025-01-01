import java.util.*;

public class F_Cycles_in_UNDirectedGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 6));

        graph[5].add(new Edge(5, 6));

        // This edge creates a cycle (5 -> 3)
        graph[5].add(new Edge(5, 3));
    }

    public static boolean isCyclic(ArrayList<Edge>[] graph) {
        int[] color = new int[graph.length]; // 0 -> WHITE, 1 -> GRAY, 2 -> BLACK

        // Check for all vertices
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == 0) {
                if (isCyclicUtil(graph, color, i)) {
                    return true; // Cycle detected
                }
            }
        }
        return false; // No cycle found
    }

    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, int[] color, int curr) {
        color[curr] = 1; // Mark the current node as GRAY (being visited)

        // Traverse the neighbors
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (color[e.dest] == 0) {
                // If the neighbor is WHITE, explore it recursively
                if (isCyclicUtil(graph, color, e.dest)) {
                    return true;
                }
            } else if (color[e.dest] == 1) {
                // If the neighbor is GRAY, a cycle is detected
                return true;
            }
        }

        color[curr] = 2; // Mark the current node as BLACK (fully processed)
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCyclic(graph));  // Output will be true since a cycle exists
    }
}
