public class B_Search_in_BST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // Search in BST
    public static boolean search(Node root, int val){
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        }

        if (root.val > val) {
            return search(root.left, val);
        }
        else{
            return search(root.right, val);
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

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();
        if (search(root, 1)) {
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}