import java.util.PriorityQueue;

public class C_Nearby_Cars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distsq;
        int idex;

        Point(int x, int y, int distsq, int idex) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.idex = idex;
        }

        @Override
        public int compareTo(Point P2) {
            return this.distsq - P2.distsq;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();

        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        for (int i = 0; i < pts.length; i++) {
            int distsq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distsq, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.print("C" + pq.remove().idex + " ");
        }
    }
}
