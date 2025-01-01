public class pyramid {
    public static void main(String[] args) {
        Pyramid(5);
    }

    public static void Pyramid(int rows){
        for(int i=1; i<=rows; i++){
            // spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
