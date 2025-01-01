import java.util.*;
public class updateith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        System.out.println("Enter the position you want to replace :");
        int position = sc.nextInt();
        System.out.println("Enter bit you want replace :");
        int bit = sc.nextInt();

        // Clear ith bit 
        int bitmask = ~(1<<position);
        int newnum = number & bitmask;

        // Update ith bit 
        int updatednum = newnum | (bit << position);
        System.out.println("Updated number is :"+updatednum);

        sc.close();
    }
}
