import java.util.*;

public class Practise {
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
    static class BinaryTree{
        static int idex = -1;
        public static Node buildTree(int nodes[]){
            idex++;
            if (nodes[idex] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idex]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void preOrderTree(Node root){
            if (root==null) {
                return;
            }

            System.out.print(root.data+" ");
            preOrderTree(root.left);
            preOrderTree(root.right);
        }
        public static void InOrderTree(Node root){
            if (root==null) {
                return;
            }
            InOrderTree(root.left);
            System.out.print(root.data+" ");
            InOrderTree(root.right);
        }
        public static void PostOrderTree(Node root){
            if (root==null) {
                return;
            }
            PostOrderTree(root.left);
            PostOrderTree(root.right);
            System.out.print(root.data+" ");
        }
        public static void LevelOrder(Node root){
            if (root==null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static int height(Node root){
        if (root==null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) +1;
    }
    public static int No_of_Nodes(Node root){
        if (root==null) {
            return 0;
        }

        int leftCount = No_of_Nodes(root.left);
        int rightCount = No_of_Nodes(root.right);

        return (leftCount+ rightCount +1);
    }
    public static int Sum_of_Nodes(Node root){
        if (root==null) {
            return 0;
        }

        int leftCount = Sum_of_Nodes(root.left);
        int rightCount = Sum_of_Nodes(root.right);

        return (leftCount+ rightCount +root.data);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.print("PreOrder Tree is :");
        tree.preOrderTree(root);
        System.out.println();
        System.out.print("InOrder Tree is  :");
        tree.InOrderTree(root);
        System.out.println();
        System.out.print("PostOrder Tree is:");
        tree.PostOrderTree(root);

        System.out.println();
        tree.LevelOrder(root);

        System.out.println();
        System.out.println("Height of a Tree :"+height(root));
        System.err.println("No of Nodes are  :"+No_of_Nodes(root));
        System.out.println("Sum of Nodes are :"+Sum_of_Nodes(root));
        
    }
}