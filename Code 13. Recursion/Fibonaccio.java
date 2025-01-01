public class Fibonaccio {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    public static int fibo(int n){
        if (n == 1 || n ==0) {
            return n;
        }
        int fibo1 = fibo(n-2);
        int fibo2 = fibo(n-1);
        int fibon = fibo1 + fibo2;
        return fibon;
    }
}
