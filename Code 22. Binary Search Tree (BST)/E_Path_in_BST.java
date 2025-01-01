import java.util.ArrayList;

public class E_Path_in_BST {
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

    public static void PrintPath(Node root, ArrayList<Integer> path){
        if (root==null) {
            return ;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            System.out.println(path);
        }

        PrintPath(root.left, path);
        PrintPath(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = { 8, 5, 10, 11, 14, 3, 6, 1, 4 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        System.out.println();
        PrintPath(root, new ArrayList<>());
    }
}