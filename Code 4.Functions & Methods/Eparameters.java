import java.util.*;
public class Eparameters{

    public static int sumoftwo(int num1,int num2){ // Parameters or formal parameters 
        int sum =num1 + num2;
        System.out.println("Sum is "+ sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        sumoftwo(a,b); // Arguments or actual parameters
        in.close();
    }
}