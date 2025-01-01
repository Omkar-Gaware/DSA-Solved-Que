public class D_Print_Range {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.val > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void printInRange(Node root, int k1, int k2){
        if (root == null) {
            return;
        }

        if (root.val >= k1 && root.val <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.val+" ");
            printInRange(root.right, k1, k2);
        }else if (root.val > k1) {
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        int values[] = { 8, 5, 10, 11, 14, 3, 6, 1, 4 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();
        printInRange(root , 5, 12);
    }
}