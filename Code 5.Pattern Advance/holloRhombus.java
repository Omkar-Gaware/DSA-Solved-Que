public class holloRhombus {
    public static void main(String[] args) {
        hollo_Rhombus(7);
    }
    public static void hollo_Rhombus(int row){
        for(int i=1; i<=row; i++){
            // Spaces
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            //Stars
            for(int p=1;p<=row; p++){
                if(i==1 || i==row || p==1 || p==row){
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
