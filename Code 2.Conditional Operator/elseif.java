import java.util.*;
public class elseif {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your age :");
        int i=in.nextInt();
        if(i>18){
            System.out.println("You are Eligible for Driving.");
        }
        else if((i>13) && (i<18)){
            System.out.println ("You are Teenager.");
        }
        else{
            System.out.println("You are child.");
        }
         in.close();
    }
}
