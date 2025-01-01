public class Power {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        int pnm1 = power(x, n-1);
        int pw = x * pnm1;
        return pw;
    }
}
