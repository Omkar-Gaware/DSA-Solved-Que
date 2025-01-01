public class f_GridTrick {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        
        int numnator = fact(n-1 +m-1);
        int denominator = fact(n-1) * fact(m-1);

        System.out.println(numnator/denominator);
    }
    public static int fact(int n){
        if (n==1) {
            return 1;
        }
        int ans = n * fact(n-1);
        return ans;
    }
}
