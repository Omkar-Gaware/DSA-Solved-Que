public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorials(4));
    }
    public static int Factorials(int n){
        int fact=1;
        for(int i=1; i<= n; i++){
            
            fact= fact * i;
        }
        return fact;
    }
}
