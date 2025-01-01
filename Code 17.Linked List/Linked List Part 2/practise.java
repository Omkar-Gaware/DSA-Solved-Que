public class practise {
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

    public void addFirst(int data){
        // step 1 Creation of new Linked List
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 newnode next = head
        newNode.next = head;   //link

        // step 3 head = newNode
        head = newNode;
    }
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
    Node merge(Node head1, Node head2){
        Node newll = new Node(-1);
        Node temp = newll;

        while (head1!= null && head2!= null) {
            if (head1.data<head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1!= null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            
        }
        while (head2!= null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            
        }
        return newll.next;

    }
    Node midNode(Node head){
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    Node mergeSort(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        // find Mid
        Node mid = midNode(head);

        Node rightNode = mid.next;
        mid.next = null;

        Node newLeftNode = mergeSort(head);
        Node newRightNode = mergeSort(rightNode);
        

        // Merge
        return merge(newLeftNode, newRightNode);

    }
    public static void main(String[] args) {
        practise ll = new practise();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(7);
        ll.print();
        ll.mergeSort(head);
        ll.print();

    }
}