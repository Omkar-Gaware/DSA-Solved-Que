public class A_Diameter_of_Tree {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int Diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = Diameter(root.left);
        int rightDiam = Diameter(root.right);
        int leftHei = height(root.left);
        int rightHei = height(root.right);

        int selfDiam = leftHei + rightHei + 1;

        return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
    }

    public static void main(String[] args) {

        //      1
        //    /   \
        //   2     3
        //  / \   / \
        // 4   5 6   7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Diameter(root));
    }
}
