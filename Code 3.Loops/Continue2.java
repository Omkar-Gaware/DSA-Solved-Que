import java.util.*;
public class Continue2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Enter the Number:");
            int i=in.nextInt();
            if(i%10==0){
                continue;
            }
            if(i==9){
                break;
            }
            System.out.println("You are Entered number:"+i);
        }while(true);
        in.close();
    }
}
