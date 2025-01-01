import java.util.*;
public class Hisprime {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        System.out.println(isprime(n));
        in.close();
    }

    public static boolean isprime(int n){
        boolean isprime=true;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
        if (isprime==true){
            System.out.println("Number is Prime number");
        }else{
        System.out.println("Number is not Prime number");

        }
        return isprime;
    }
}
