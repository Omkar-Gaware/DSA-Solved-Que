public class SumofNatural {
    public static void main(String[] args) {
        System.out.println(Sum(5));        
    }
    public static int Sum(int n){
        if (n == 1) {
            return 1;
        }
        int SUM = n + Sum(n-1);
        return SUM;
    }
}