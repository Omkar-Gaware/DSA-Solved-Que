// import java.util.*;
public class Flargest {
   public static int largest(int number[]){
    int largest = Integer.MIN_VALUE;
    int Smallest = Integer.MAX_VALUE;
    for(int i=0; i<number.length; i++){
        /*if(largest<number[i]){
            largest=number[i];
        }
        if(Smallest>number[i]){
            Smallest = number[i];
        }
        */

        largest = Math.max(largest, number[i]);
        Smallest = Math.min(Smallest, number[i]);
    }
    System.out.println("Smallest number is :"+Smallest);
    return largest;

   }

   public static void main(String[] args) {
    int number[]= {2,3,4,5,6,7,3,11};
    
    System.out.println("Largest number is : "+largest(number));
    
   }
}
