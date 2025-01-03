public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;


        public void Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // addFirst
    public void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        size++;
        if (head==null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if (head == null) {
            System.out.println("ll is empty.");
            return Integer.MIN_VALUE;
        }
        if (size==1) {
            int val = head.data;
            head= tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next ;
        head.prev = null;
        size--;
        return val;
    }
    public void addLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;

        return;
    }
    public int removeLast(){
        if (head == null) {
            System.out.println("ll is empty.");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(4);
        dll.print();
        dll.addFirst(3);
        dll.print();
        dll.addFirst(2);
        dll.print();
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addLast(8);
        dll.print();
        dll.removeLast();
        dll.print();
    }
}
