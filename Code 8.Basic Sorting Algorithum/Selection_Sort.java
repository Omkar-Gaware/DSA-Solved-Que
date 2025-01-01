public class Selection_Sort {
    public static void Selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minnum=i;
            for(int j=i+1; j<arr.length; j++){
            if(arr[minnum]>arr[j]){
                minnum = j;
            }
        }
        //swap 
        int swap = arr[minnum];
        arr[minnum] = arr[i];
        arr[i] = swap;
        }

        //print
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Selection(arr);
        System.out.println();
    }
}
