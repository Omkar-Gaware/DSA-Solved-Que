public class MeregeSortOnLL {
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

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Mid
    }

    public static Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2!= null) {
            if (head1.data< head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2!= null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }
    public static Node mergesort(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        // find Mid
        Node Mid = getMid(head);

        // Find left half and right half
        Node rightHead = Mid.next;
        Mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight = mergesort(rightHead);

        // Merge 
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        MeregeSortOnLL ll = new MeregeSortOnLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
        ll.head = ll.mergesort(ll.head);

        ll.print();
    }
}