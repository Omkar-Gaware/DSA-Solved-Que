public class G_Mirror_BST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node mirror(Node root){
        if (root==null) {
            return null;
        }

        Node LeftMirror = mirror(root.left);
        Node RightMirror = mirror(root.right);

        root.left = RightMirror;
        root.right = LeftMirror;

        return root;
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        Node preorder = mirror(root);
        preorder(preorder);
    }
}

