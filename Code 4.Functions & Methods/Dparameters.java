import java.util.*;
public class Dparameters {


    public static void sumoftwo(int num1,int num2){ //2.acess of parameters in form of num1 & num2;
        int sum =num1 + num2;
        System.out.println("Sum is "+ sum);
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        sumoftwo(a,b); //1.we can pass parameters in for of a&b,
        in.close();
    }
}
