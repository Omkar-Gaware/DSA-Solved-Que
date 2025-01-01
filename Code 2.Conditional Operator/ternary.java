import java.util.*;
public class ternary {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        // ternary
        String num = (number%2==0) ? "Even" : "Odd" ;
        System.out.println(num);
        in.close();
    }
}