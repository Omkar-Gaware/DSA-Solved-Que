public class Counting {
    public static void main(String[] args) {
        int arr[]={5,4,2,1,3 };
        Counter(arr);
    }
    public static void Counter(int arr[]){
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            Largest = Math.max(Largest, arr[i]);
        }

        int Count[] = new int[Largest+1];
        for(int i=0; i<arr.length; i++){
            Count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<Count.length; i++){
            while (Count[i]>0) {
                arr[j]=i;
                j++;
                arr[i]--;
            }
        }
    }
}
