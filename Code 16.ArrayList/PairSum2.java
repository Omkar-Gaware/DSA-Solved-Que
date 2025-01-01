import java.util.ArrayList;

public class PairSum2 {
    public static Boolean Twopointer(ArrayList<Integer> list, int target) {
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int LP = bp + 1;
        int RP = bp;
        int n = list.size();
        while (LP != RP) {
            if (list.get(RP) + list.get(LP) == target) {
                return true;
            }

            if (list.get(RP) + list.get(LP) < target) {
                LP = (LP + 1) % n;
            } else {
                RP = (n + RP - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.err.println(Twopointer(list, 16));
    }
}
