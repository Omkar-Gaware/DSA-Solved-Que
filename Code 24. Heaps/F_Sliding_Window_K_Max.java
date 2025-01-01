import java.util.ArrayList;
import java.util.PriorityQueue;

public class F_Sliding_Window_K_Max {
    static class Pair implements Comparable<Pair> {
        int val;
        int idex;

        Pair(int val, int idex) {
            this.val = val;
            this.idex = idex;
        }

        @Override
        public int compareTo(Pair p2) {
            // Accending Order
            // return this.val - p2.val

            // decending
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        result.add(pq.peek().val);
        for (int i = k; i < arr.length; i++) {
            while (!pq.isEmpty() && pq.peek().idex <= (i - k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            result.add(pq.peek().val);
        }

        // print
        System.out.println(result);

    }
}