public class FOYDS {
    public static void main(String[] args) {
        Foyds(5);
    }
    public static void Foyds(int row){
        int number=1;
        for(int i=1; i<=row; i++){
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
