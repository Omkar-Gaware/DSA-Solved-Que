public class E_transform_to_sum {
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

    public static int Transform(Node root){
        if (root == null) {
            return 0;
        }

        int leftchild = Transform(root.left);
        int rightchild = Transform(root.right);

        int data = root.data;

        int newLeft = root.left==null  ? 0 : root.left.data; 
        int newRight = root.right==null  ? 0 : root.right.data; 

        root.data = newLeft + leftchild + newRight + rightchild;

        return data;
    }
    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
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

        Transform(root);
        preOrder(root);
    }
}
