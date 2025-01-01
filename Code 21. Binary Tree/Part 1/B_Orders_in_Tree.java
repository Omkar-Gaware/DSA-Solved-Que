public class B_Orders_in_Tree {
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

        public static void PreOrderTree(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data+" ");
            PreOrderTree(root.left);
            PreOrderTree(root.right);

        }

        public static void inorderTree(Node root) {
            if (root == null) {
                return;
            }

            inorderTree(root.left);
            System.out.print(root.data+" ");
            inorderTree(root.right);
        }
        public static void postorderTree(Node root) {
            if (root == null) {
                return;
            }

            postorderTree(root.left);
            postorderTree(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        // tree.PreOrderTree(root);
        // tree.inorderTree(root);
        tree.postorderTree(root);
    }
}