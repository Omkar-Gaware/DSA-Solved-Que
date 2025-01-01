public class solidrhombus {
    public static void main(String[] args) {
        Rhombus(8);
    }
    public static void Rhombus(int row){
        for(int i=1; i<=row; i++){
            //Space
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
