public class searchkey2 {
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 33;
        int row= matrix.length-1;
        int col = 0;
        while (row>=0 && col<matrix.length) {
            if (key == matrix[row][col]) {
                System.out.println(row+","+col);
                break;
            }
            else if(key<matrix[row][col]){
                row--;
            }
            else if(key>matrix[row][col]){
                col++;
            }
        }
    }    
}