import java.util.Scanner;

public class Binput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size :");
        int size= sc.nextInt();
        int marks[] = new int[size];
        // Taking input of array from user
        for(int i=0; i<size; i++){
            System.out.print("Enter Marks of student "+(i+1)+" :");
            marks[i] = sc.nextInt();
        }
        // Printing array / display
        for(int i=0; i<size; i++){
            System.out.println("Entered marks of student "+(i+1)+" :"+marks[i]);
        }
        sc.close();
    }
}
