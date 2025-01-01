public class PrimeRange {
    public static void main(String[] args) {
        Print(20);
    }

    public static void Print(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i) == true) {
                System.out.print(i+" ");

            } 
        }
    }

    public static boolean isprime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
