public class RivisionSelection {
    public static void Selection(int arr[]){
        for(int i=0; i<arr.length-2; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,6,2,7,9,1,3};
        Selection(arr);
        printarray(arr);
    }
}
