import java.util.ArrayList;

public class PairSum1 { // 0(n^2)
    public static Boolean BruteForce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean TwoPointer(ArrayList<Integer> list, int target) {
        // 0(n)
        int LP = 0;
        int RP = list.size() - 1;

        while (LP <= RP) {
            if (list.get(LP) + list.get(RP) == target) {
                return true;
            }

            if (list.get(LP) + list.get(RP) < target) {
                LP++;
            } else {
                RP--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Brute force Approach :"+BruteForce(list, 5));
        System.out.println("Two Pointer Approach :"+TwoPointer(list, 5));
    }
}
