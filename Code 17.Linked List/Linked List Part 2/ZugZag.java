public class ZugZag {
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


    public void zigzag(){
        // find mid
        Node slow = head;
        Node fast= head.next;

        while (fast!=null && fast.next!=null) {
            fast = head.next.next;
            slow = head.next;
        }

        Node Mid = slow;
        Node curr = Mid.next;
        Mid.next = null;

        // Reverse LL
        Node prev = null;
        Node next;

        while ( curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        while (left!= null && right != null) {
            // Zigzag
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // Updation
            right = nextR;
            left = nextL;
        }

         
    }
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

    public static void main(String[] args) {
        ZugZag pr = new ZugZag();
        pr.addLast(1);
        pr.addLast(2);
        pr.addLast(3);
        pr.addLast(4);
        pr.addLast(5);
        pr.addLast(6);
        pr.print();
        pr.zigzag();
        pr.print();
    }
}