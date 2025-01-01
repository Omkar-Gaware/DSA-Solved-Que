import java.util.*;
public class Bparameters {

    public static int sumofnum(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= a + b;
        System.out.println("Sum is "+sum);
        sc.close();
        return sum;
    }
    public static void main(String[] args) {
    sumofnum();
    }
}
