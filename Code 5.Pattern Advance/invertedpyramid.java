public class invertedpyramid {
    public static void main(String[] args) {
        inverted(5);
    }

    public static void inverted(int rows){
        //Outer
        for(int i=1; i<=rows; i++){
            //numbers
            for(int j=1; j<=rows-i+1; j++){
                System.out.print( " "+j );
            }
            System.out.println();
        }
    }
}
