import java.util.*;

public class Binary_Tree {
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

    static class BinaryTree {
        static int idex = -1;

        public static Node buildTree(int nodes[]) {
            idex++;
            if (nodes[idex] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idex]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
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

    public static int Diameter(Node root) { // o(n^2)
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

    static class Info {
        int diam;
        int ht;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info OptimaizeDiam(Node root) { // o(n)
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = OptimaizeDiam(root.left);
        Info rightInfo = OptimaizeDiam(root.right);

        int diam = Math.max(leftInfo.diam, Math.max(rightInfo.diam, leftInfo.ht + rightInfo.ht + 1));

        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(Diameter(root));

        System.out.println(OptimaizeDiam(root).diam);
    }
}
