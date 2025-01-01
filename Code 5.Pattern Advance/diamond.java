public class diamond {
    public static void main(String[] args) {
        Diamond(6);
    }
    public static void Diamond(int row){
        for(int i=1; i<=row; i++){
            //Spaces
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row; i>=1; i--){
            //Spaces
            for(int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
