
public class RemoveCircular {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public boolean CircularorNot(){ // flyod's cycle finding algorithum
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (fast == slow) {
            return true;
        }
    }
    return false;
}

    public static void removeCircular(){
        // detect cycle

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle== false) {
            return;
        }

        slow = head;
        Node prev = null;

        while (slow!=fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        RemoveCircular ll = new RemoveCircular();
        head = new Node(0);
        Node temp = new Node(1);
        head.next = temp;
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = temp;
        System.out.println(ll.CircularorNot());
        removeCircular();
        System.out.println(ll.CircularorNot());
        
    }
}