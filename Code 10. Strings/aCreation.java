import java.util.*;
public class aCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Omkar";
        String str1 = new String("Omkar");

        System.out.println(str);
        System.out.println(str1);

        System.out.println("Enter Name");
        // String name = sc.next();
        // System.out.println(name);
        String fullname = sc.nextLine();
        System.out.println(fullname);

        sc.close();


    }    
}