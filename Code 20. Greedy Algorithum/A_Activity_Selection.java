import java.util.*;
public class A_Activity_Selection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        for_sorted_end(start, end);
        for_non_sorted_end(start, end);
    }
    public static void for_sorted_end(int start[], int end[]){
        //End time basis Sorting
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for(int i = 1; i< start.length; i++){
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        
        System.out.println("Maximum activies are :"+maxAct);
        print(ans);

    }
    public static void for_non_sorted_end(int start[], int end[]){
        // 2d Array
        int arr[][] = new int[start.length][3];

        for(int i=0; i< start.length; i++){
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        // Sorting array basis of End column
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));

        //End time basis Sorting
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(arr[0][0]);
        int lastEnd = arr[0][2];

        for(int i = 1; i< end.length; i++){
            if (arr[i][1] >= lastEnd) {
                maxAct++;
                ans.add(arr[i][0]);
                lastEnd = arr[i][2];
            }
        }
        
        System.out.println("Maximum activies are :"+maxAct);
        print(ans);

    }
    public static void print(ArrayList<Integer> ans){
        for(int i =0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}