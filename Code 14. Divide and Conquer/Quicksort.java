public class Quicksort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quick(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int piIndex = indexpivit(arr, si, ei);
        quick(arr, si, piIndex - 1);
        quick(arr, piIndex + 1, ei);

    }
 
    public static int indexpivit(int arr[], int si, int ei) {
        int pivit = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (pivit >= arr[j]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivit;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 2, -5, 6, 7, 3, 5, 9, 1 };
        quick(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
