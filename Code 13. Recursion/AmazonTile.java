public class AmazonTile {
    public static void main(String[] args) {
        System.out.println(Tiles(3));        
    }
    public static int Tiles(int n){
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        //kaam
        //Vertically
        int fnm1 = Tiles(n-1);

        // Horizontal
        int fnm2 = Tiles(n-2);

        int totalways = fnm1 + fnm2 ;

        return totalways;
    }
}