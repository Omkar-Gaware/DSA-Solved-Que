public class invertedoyramid {
    public static void main(String[] args) {
        Halfpyramid(6);
    }
    public static void Halfpyramid(int row){
        //Outer loop
        for(int i=1; i<=row; i++){
            //Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //Space
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
