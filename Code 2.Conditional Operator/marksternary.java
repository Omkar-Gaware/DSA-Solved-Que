import java.util.*;
public class marksternary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student Mark ");
        int Marks=in.nextInt();
        String marks=(Marks>33) ? "Pass" : "Fail" ;
        System.out.print(marks);
        in.close();
    }
}
