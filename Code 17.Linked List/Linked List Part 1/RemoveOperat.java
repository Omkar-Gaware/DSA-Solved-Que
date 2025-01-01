
public class RemoveOperat {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step 1 Creation of new Linked List
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 newnode next = head
        newNode.next = head; // link

        // step 3 head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step 1 Creation of new Linked List
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 tail.next = newNode
        tail.next = newNode;

        // step 3 tail = newnode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.print("Linked List is empty.");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idex, int data) {
        if (idex == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idex - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size == 0) {
            System.out.println("Linked List Is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size == 0) {
            System.out.println("Linked List Is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data; // temp data
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public static void main(String[] args) {
        RemoveOperat ll = new RemoveOperat();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.add(3, 9);
        ll.print();
        System.out.println(size);
        ll.removeFirst();
        ll.print();
        System.out.println(size);
        ll.removeLast();
        ll.print();
        System.out.println(size);
    }
}
