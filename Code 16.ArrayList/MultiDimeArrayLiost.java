import java.util.*;

public class MultiDimeArrayLiost {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list0 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            list0.add(i * 1);
            list1.add(i * 2);
            list2.add(i * 3);
        }

        mainList.add(list0);
        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> contains = mainList.get(i);

            for(int j=0; j<contains.size(); j++){
                System.out.print(contains.get(j)+" ");
            }
            System.out.println();
        }
    }
}