
public class Palindrome {
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

    
    public void addLast(int data){
        // step 1 Creation of new Linked List
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 tail.next = newNode
        tail.next = newNode;

        // step 3 tail = newnode
        tail = newNode;
    }
    public void print(){
        if (head == null) {
            System.out.print("Linked List is empty.");
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow;
    }
    public boolean Palindromes(){
        // 1 find Mid 
        Node Mid = findMid(head);

        // 2 reverse string from Mid Node

        Node prev = null;
        Node curNode = Mid;
        Node next;
        while (curNode != null) {
            next = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next; 
            right = right.next; 
        }

        return true;
    }
    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.Palindromes());

    }
}