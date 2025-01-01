import java.util.ArrayList;

public class B_Operations_On_Heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) < arr.get(par)) {
                // swap children to parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);

            // step 1 swap
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 remove last
            arr.remove(arr.size() - 1);

            // step 3 heapify()

            heapify(0);
            return data;
        }

        private void heapify(int i) {
            int root = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.size() - 1 && arr.get(root) > left) {
                root = left;
            }
            if (right < arr.size() - 1 && arr.get(root) > right) {
                root = right;
            }

            if (root != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(root));
                arr.set(root, temp);

                heapify(root);
            }
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        while (!h.isEmpty()) {
            System.out.println(h.remove());
        }
    }
}
