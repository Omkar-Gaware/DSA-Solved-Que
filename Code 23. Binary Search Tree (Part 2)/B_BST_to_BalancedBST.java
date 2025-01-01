import java.util.ArrayList;

public class B_BST_to_BalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node createBST(ArrayList<Integer> arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, si, mid - 1);
        root.right = createBST(arr, mid + 1, ei);

        return root;
    }

    public static void createInorder(Node root, ArrayList<Integer> arr){
        if (root == null) {
            return ;
        }

        createInorder(root.left, arr);
        arr.add(root.data);
        createInorder(root.right, arr);
    }

    
    public static Node BalancedBST(Node root){
        // Find Inorder Sequence
        ArrayList<Integer> arr = new ArrayList<>();
        createInorder(root, arr);

        // inorder to BST
        root = createBST(arr, 0, arr.size()-1);

        return root;
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) +1;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        Node newRoot = BalancedBST(root);
        preorder(newRoot);
        System.out.println();
        System.out.println("Height of BST :"+height(root));
        System.out.println("Height of new BST :"+height(newRoot));
    }
}