public class revpyramid {
    public static void main(String[] args) {
        Invertedpyramid(8);
    }

    public static void Invertedpyramid(int row){
        for(int i=1; i<=row; i++){
            // spaces
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
