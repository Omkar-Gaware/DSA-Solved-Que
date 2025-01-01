import java.util.*;
public class largest3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of A ");
        int a=in.nextInt();
        System.out.print("Enter value of B ");
        int b=in.nextInt();
        System.out.print("Enter value of C ");
        int c=in.nextInt();

        if(a>=b && a>=c){
            System.out.print("value of A is greater");
        }
        else if(b>=c){
            System.out.print("value of B is greater");
        }
        else{
            System.out.print("value of C is greater");
        }
        in.close();
    }
}
