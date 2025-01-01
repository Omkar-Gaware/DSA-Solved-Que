public class GBinarySearch {
    public static void main(String[] args) {
        int number[] = {2,3,4,5,6,7,8,9,10};
        int num=7;

        System.out.println("Index number is :"+Indexfind(number, num));
    }
    public static int Indexfind(int number[], int num){
        int start=0;
        int end= number.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if (number[mid]==num) {
                return mid;
            }
            if(number[mid]<num){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
