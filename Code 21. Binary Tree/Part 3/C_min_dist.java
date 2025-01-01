public class C_min_dist {
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

    // o(n) , o(1)
    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftNode = lca(root.left, n1, n2);
        Node rightNode = lca(root.right, n1, n2);

        if (rightNode == null) {
            return leftNode;
        }

        if (leftNode == null) {
            return rightNode;
        }

        return root;
    }

    public static int lcadist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftdist = lcadist(root.left, n);
        int rightdist = lcadist(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }
    }

    public static int Min_Dist(Node root, int n1, int n2) {
        Node LCA = lca(root, n1, n2);
        int dist1 = lcadist(LCA, n1);
        int dist2 = lcadist(LCA, n2);

        return dist1 + dist2;
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

        System.out.println(Min_Dist(root, 3,4));
    }
}
