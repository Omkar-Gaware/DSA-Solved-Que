public class D_Kth_Ancestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int KAncestor(Node root, int n, int k){
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftdist = KAncestor(root.left, n, k);
        int leftright = KAncestor(root.right, n, k);

        int max = Math.max(leftdist, leftright);

        if (max+1 == k) {
            System.out.println("Node is :"+root.data);
        }

        return max+1;
    }
    public static void main(String[] args) {

        // 1
        // / \
        // 2 5
        // / \ \
        // 3 4 6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.right.right = new Node(6);
        root.left.right = new Node(4);

        System.out.println("Distance is :"+KAncestor(root, 3,2));
    }
}
