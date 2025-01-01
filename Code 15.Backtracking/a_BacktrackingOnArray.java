public class a_BacktrackingOnArray {
    public static void changeArr(int arr[], int i, int val){
        //Base Case
        if (i==arr.length) {
            printArr(arr);
            return;
        }
        //kaam
        arr[i] = val;   //Assign Value
        changeArr(arr, i+1, val+1); //Recuersive Step
        arr[i] = arr[i] -2 ;  //Backtracking Step
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }    
}