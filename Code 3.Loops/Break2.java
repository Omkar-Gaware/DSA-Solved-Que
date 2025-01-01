import java.util.*;
public class Break2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter the number:");
            int n=in.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        } while(true);
        System.out.println("I am Out From the loop.");
        in.close();
    }
}
