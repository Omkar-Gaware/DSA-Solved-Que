import java.util.*;
public class O_Cheapest_flight_with_k {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    static class Info{
        int v;
        int cost; 
        int stop;

        Info(int v, int cost, int stop){
            this.v = v;
            this.cost = cost;
            this.stop = stop;
        }
    }
    public static void CreateGraph(int flights[][], ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i] [2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);  
        }
    }

    public static int cheapest_flight(int flights[][], int src, int dest, int k, int n){
        ArrayList<Edge> graph[] = new ArrayList[n];
        CreateGraph(flights,graph);
        
        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
 
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stop > k) {
                break;
            }

            for(int i=0; i< graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[i] != Integer.MAX_VALUE && dist[u] + wt < dist[v] && curr.stop<=k) {
                    dist[v] = dist[u] + wt;
                    q.add(new Info(v,dist[v], curr.stop+1));
                }
            }
        }

        // Dist Of Dest
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int flight[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dest = 3, k = 1;
        System.out.println(cheapest_flight(flight, src, dest, k, n));
    }
}
