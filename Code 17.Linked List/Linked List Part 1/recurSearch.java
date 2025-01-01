
public class recurSearch {
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
    public int search(Node head, int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idex = search(head.next, key);
        if (idex == -1) {
            return -1;
        }

        return idex+1;
    }
    public int recuSearch(int key){
        return search(head, key);
    }
    public static void main(String[] args) {
        recurSearch ll = new recurSearch();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println(ll.recuSearch(3));
    }
}