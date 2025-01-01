public class holloRec {
   public static void main(String[] args) {
    Hollo_Rectangle(10, 7);
}

public static void Hollo_Rectangle(int totrows, int totcolumns){
    //outer loop
    for(int i=1; i<=totrows; i++){
        //inner loop
        for(int j=1; j<=totcolumns; j++){
            if (i==1 || i== totrows || j==1 || j== totcolumns) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
         System.out.println();
    }
}
    
}