import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();

        boolean isprime=true;
        
        if (n==2) {
            System.out.println("Is a prime Number.");
        }
        else{
            for(int i=2; i<=Math.sqrt(n)/*place if squareroot(n)n<(n-1) = time saving*/; i++){
            if(n % i== 0){
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println("It is a prime number:");
        }else{
            System.out.println("It is not a prime number");
        }
    }
    scanner.close();    
    }
}