public class Fastpower {
    public static void main(String[] args) {
        System.out.println(fastpower(2, 2 ));        
    }
    public static int fastpower(int n, int a){
        int ans = 1;

        while (n>0) {
            if ((n&1)!=0) {
                ans = ans * a;
            }
            a = a*a;
            n = (n>>1);
        }
        return ans;
    }
}
