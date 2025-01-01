import java.util.*;
public class AImp {
    public static void main(String[] args) {
        
        int prod = multiply();
        System.out.println("Proudct of a & b = "+prod);
        int fact = factorial();
        System.out.println("factorial is = "+fact);
        
    }
    //Multiplication
    public static int multiply(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a= in.nextInt();
        System.out.print("Enter value of b: ");
        int b= in.nextInt();
        int product= a*b;
        // in.close();
        return product;
    }
    // Factorial of Num
    public static int factorial(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number n: ");
        int num=sc.nextInt();
        int factorial=1;
        
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        // sc.close();
        return factorial;

    }
    /*public static int binomial(){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n= in.nextInt();
        System.out.print("Enter value of r: ");
        int r= in.nextInt();
        int numerator=1;
        int dinominator1=1;
        int circle;
        float multiply;
        int answer;
        // n^Cr = n! / r!(n-r)!
        for (int i=1; i<=n; i++){
            numerator*=i;
            dinominator1= r*i;
            circle= (r-n);
            
        }
        multiply = dinominator1 * circle ;*/
        
        

    }


