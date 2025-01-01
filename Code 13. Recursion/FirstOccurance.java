public class FirstOccurance {
    public static void main(String[] args) {
        int array[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(occurance(array, 0));
    }
    public static int occurance(int array [] , int i){
        if (i == array.length-1) {
            return -1;
        }
        if (array[i] == 5) {
            return i;
        }
        return occurance(array, i+1);
    }
}
