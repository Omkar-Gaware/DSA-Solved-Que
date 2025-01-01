import java.util.*;
public class syntax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[3][4];
        int m=array.length, n=array[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
            
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}