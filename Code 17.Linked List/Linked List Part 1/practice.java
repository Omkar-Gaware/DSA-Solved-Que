
public class practice {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    void print(){
        if (head == null) {
            System.out.println("LL is empty");
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    int removeFirst(){
        if (size == 0) {
            System.out.println("ll is empty.");
            return Integer.MIN_VALUE;
        }
        else if (size== 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
            head = head.next;
            size --;
            return val;
    }
    int removeLast(){
        Node temp = head;
        if (size == 0) {
            System.out.println("ll is empty.");
            return Integer.MIN_VALUE;
        }
        else if (size== 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        for(int i = 0 ; i<size -2; i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    int removeIndex(int idex){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        for(int i= 0; i< idex-1; i++){
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }
    public static void main(String[] args) {
        practice pr = new practice();
        pr.addFirst(1);
        pr.addLast(2);
        pr.addFirst(0);
        pr.addLast(3);
        pr.addLast(4);
        pr.addLast(5);
        pr.print();
        
    }
}