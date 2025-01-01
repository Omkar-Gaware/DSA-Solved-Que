import java.util.HashSet;

public class D_Union_Intersection {
    public static void main(String[] args) {
        int arr1[] = { 3, 7, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();
        // Union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union is :" + set.size());

        // Intersection
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]);
            }
        }

        System.out.print("Intersecation is :" + count);
    }
}
