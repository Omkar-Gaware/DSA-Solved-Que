import java.util.PriorityQueue;

public class E_Weakest_Soldier {
    static class Row implements Comparable<Row> {
        int soldier;
        int idex;

        Row(int soldier, int idex) {
            this.soldier = soldier;
            this.idex = idex;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldier == r2.soldier) {
                return this.idex - r2.idex;
            } else {
                return this.soldier - r2.soldier;
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        System.out.print("Weakest Soldiers Are : ");
        for (int i = 0; i < k; i++) {
            System.out.print("S" + pq.remove().idex + " ");
        }
    }

}
