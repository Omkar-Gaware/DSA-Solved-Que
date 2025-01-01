public class RivisionBubble {
    public static void Bubblesort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap = 0;
            for(int i=0; i<arr.length-1-turn; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }
            }
            if (swap==0) {
                System.out.println("Array is Sorted.");
                return;
            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Bubblesort(arr);
        printarray(arr);
    }
}
