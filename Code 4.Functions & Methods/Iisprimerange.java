public class Iisprimerange{
    public static void main(String[] args) {
        primesinrange(20);
    }

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesinrange(int n){
        for(int i=2; i<=n; i++){
        if(isprime(n)){
            System.out.print(i);
        }
        }
        System.out.println();
    }
}