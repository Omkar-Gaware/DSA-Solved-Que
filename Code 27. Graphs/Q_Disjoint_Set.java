public class Q_Disjoint_Set {
    static int n = 7;
    static int par[] = new int[n];
    static int rank[] = new int[n];

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
    public static void main(String[] args) {
        init();
        System.out.println(find(3));
        Union(1,3);
        System.out.println(find(3));
        Union(2,4);
        Union(3, 6);
        Union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
    }
}
