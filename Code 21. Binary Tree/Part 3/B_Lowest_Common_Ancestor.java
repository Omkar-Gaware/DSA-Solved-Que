import java.util.ArrayList;

public class B_Lowest_Common_Ancestor {
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

    public static boolean getpath(Node root, int n, ArrayList<Node> path){
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean leftPath = getpath(root.left, n, path);
        boolean rightPath = getpath(root.right, n, path);

        if (leftPath || rightPath) {
            return true;
        }
        path.remove(path.size()-1);
        return false;


    }
    // o(n) , o(n)
    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        int i =0;
        for(; i<path1.size() && i<path2.size(); i++){
            if (path1.get(i) != path2.get(i)) {
               break; 
            }
        }

        return path1.get(i-1);
    }

    // o(n) , o(1)
    public static Node lca2(Node root, int n1, int n2){ 
        if (root==null || root.data == n1 || root.data==n2) {
            return root;
        }

        Node leftNode = lca2(root.left, n1, n2);
        Node rightNode = lca2(root.right, n1, n2);

        if (rightNode == null) {
            return leftNode;
        }

        if (leftNode == null) {
            return rightNode;
        }

        return root;
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

        System.out.println(lca(root, 3, 4).data);
        System.out.println(lca2(root, 3, 4).data);
    }
}
