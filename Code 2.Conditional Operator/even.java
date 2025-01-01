import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the Number"); 
        int i= sc.nextInt();
        if(i%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
