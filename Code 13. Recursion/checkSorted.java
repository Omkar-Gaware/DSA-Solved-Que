public class checkSorted {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        System.out.println(isSorted(array, 0));
    }
    public static Boolean isSorted(int array[] , int i){
        if (i == array.length-1) {
            return true;
        }
        if (array[i] > array[i+1]) {
            return false;
        }
        
        return isSorted(array, i+1);
    }
}
