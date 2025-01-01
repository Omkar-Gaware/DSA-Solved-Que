import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class R_Kruskals {
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }
    public static void init(){
        for (int i = 0; i <n; i++) {
            par[i] = i;
        }
    }
    public static int find(int x){
        if (x == par[x]) {
            return x;
        }
        return find(par[x]);
    }
    public static void Union(int a, int b){
        int ParA = find(a);
        int ParB = find(b);

        if (rank[ParA] == rank[ParB]) {
            par[ParB] = ParA;
            rank[ParA]++;
        }else if (rank[ParA] < rank[ParB]) {
            par[ParA] = ParB;
        }else{
            par[ParB] = ParA;
        }
    }
    public static void CreateGraphg(ArrayList<Edge> edges){
        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));
        edges.add(new Edge(1,3,40));
        edges.add(new Edge(2,3,50));
    }
    public static void Kruskals(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);
        int MST = 0;
        int count = 0;

        for (int i = 0; i < V-1; i++) {
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if (parA!=parB) {
                Union(e.src,e.dest);
                MST += e.wt;
            }
        }
        System.out.println(MST);
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> e = new ArrayList<>();
        CreateGraphg(e);
        Kruskals(e, v);
    }
}