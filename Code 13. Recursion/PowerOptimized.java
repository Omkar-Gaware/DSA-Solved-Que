public class PowerOptimized {
    public static void main(String[] args) {
        System.out.println(Power(2, 4));        
    }
    public static int Power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = Power(x, n/2);
        int half = halfpower * halfpower;

        if (n % 2 != 0) {
            half = x * half;
        }

        return half;
    }
}