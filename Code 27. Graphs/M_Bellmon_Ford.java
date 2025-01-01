import java.util.*;

public class M_Bellmon_Ford {
    public static class Edge {
        int src;
        int dest;
        int weig;

        public Edge(int src, int dest, int weig) {
            this.src = src;
            this.dest = dest;
            this.weig = weig;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2,-4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1,-1));

    }
    public static void Bellmon_Ford(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length];

        for(int i=0;i < graph.length; i++){
            if (src!= i) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V= graph.length;
        // Traversing edges
        // 0(V*E)
        for(int i=0; i< V-1; i++){
            // all Edges
            for(int j=0; j< graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    // u v wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.weig;

                    if ( dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for (int i = 0; i < dist.length-1; i++) {
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        int src = 0;

        Bellmon_Ford(graph, src);
    }
}
