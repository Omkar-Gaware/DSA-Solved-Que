import java.util.ArrayList;

public class F_Validate_BST {
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
    public static boolean Valid_BST(Node root, Node min, Node max){
        if (root == null) {
            return true;
        }

        if (min!=null && root.data <= min.data)  {
            return false;
        }

        else if(max!= null && root.data >= max.data){
            return false;
        }

        return Valid_BST(root.left, min, root) && Valid_BST(root.right, root, max);
    }
    public static void main(String[] args) {
        
        int arr[] = {8,5,3,6,10,11,14};
        Node root = null;

        inorder(root);
        
        for (int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }


        if (Valid_BST(root, null, null)) {
            System.out.print("Valid");
        }else{
            System.out.print("Invalid");
        }
    }
}