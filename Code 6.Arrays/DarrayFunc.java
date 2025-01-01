public class DarrayFunc {

    public static void update(int array[], int a) {
        a=10;
        for(int i=0; i<array.length; i++){
            array[i] = array[i] +1;
        }
    }
    public static void main(String[] args) {
        int a=5;
        int array[] = {39,49,59};
        System.out.print("Initial values of array:" );
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println(a);

        update(array,a);
        System.out.print("Updated values of array:");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(a);// result : array values are changed but int a is not change
    }                         // i.e. array follows call by reference
}
