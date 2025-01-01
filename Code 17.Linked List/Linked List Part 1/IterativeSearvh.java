
public class IterativeSearvh {
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
    public int iteSearch(int key){
        Node temp = head;
        int i=0;
        while (temp!=null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        IterativeSearvh ll = new IterativeSearvh();
        
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println(ll.iteSearch(4));
    }
}