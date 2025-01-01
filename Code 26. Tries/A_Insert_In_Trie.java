public class A_Insert_In_Trie {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idex = word.charAt(i) - 'a';
            if (curr.children[idex] == null) {
                curr.children[idex] = new Node();
            }
            curr = curr.children[idex];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idex = word.charAt(i) - 'a';
            if (curr.children[idex] == null) {
                return false;
            }
            curr = curr.children[idex];
        }

        return curr.eow == true;
    }

    public static void main(String[] args) {
        String arr[] = { "the", "a", "there", "their", "any", "thee" };

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        System.out.println(search("there"));

    }
}