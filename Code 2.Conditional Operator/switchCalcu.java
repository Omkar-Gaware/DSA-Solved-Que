import java.util.*;
public class switchCalcu {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter What operation Do you Want to Perform .");
        System.out.print("\n 1 = Addition.\n 2 = Substraction.");
        System.out.print("\n 3 = Multiplication.\n 4 = Division.\n");
        int Number=in.nextInt();
        System.out.print("Enter value of A :");
        int a= in.nextInt();
        System.out.print("Enter value of B :");
        int b= in.nextInt();
        switch(Number){
            case 1: System.out.println(a+b);
                    break;
            case 2: System.out.println(a-b);
                    break;
            case 3: System.out.println(a*b);
                    break;
            case 4: System.out.println(a/b);
                    break;
            default :System.out.println("Enter Valid Operation");
        }
        in.close();
    }
}