public class LastOccurance {
    public static void main(String[] args) {
        int array[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurance(array, 5, 0));
    }
    public static int lastOccurance(int array[] ,int key, int i){
        if (i == array.length-1) {
            return -1;
        }
        int isfound = lastOccurance(array, key, i+1);

        if (isfound == -1 && array[i] == key) {
            return i;
        }

        return isfound;
    }
}
