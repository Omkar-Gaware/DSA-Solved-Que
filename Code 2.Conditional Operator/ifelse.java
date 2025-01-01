import java.util.*;

public class ifelse{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age= sc.nextInt();

        if( age >= 18) {
            System.out.println("You are Eligible for Driving and voting");
        }
        else{
            System.out.println("You are Not-Eligible for Driving and voting");
        }
        sc.close();
    }
}