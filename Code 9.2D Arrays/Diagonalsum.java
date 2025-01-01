public class Diagonalsum {
    public static void main(String[] args) {
        int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            //Primary Diagonal
            sum+= arr[i][i];
            //Secondary Diagonal
            if(i!= arr.length-1-i)          // i+j = n-1
            sum+= arr[i][arr.length-1-i];   //   j = n-1-j
        }
        System.out.println(sum);
    }
}
