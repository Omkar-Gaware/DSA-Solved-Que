import java.util.*;
public class Cparameters {
    public static void sumoftwo(int a,int b){
        int sum =a+ b;
        System.out.println("Sum is "+ sum);
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        sumoftwo(a,b);
        in.close();
    }
}
