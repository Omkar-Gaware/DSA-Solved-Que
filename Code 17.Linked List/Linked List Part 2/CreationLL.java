import java.util.LinkedList;
public class CreationLL{
    public static void main(String[] args) {
        // Creation of Linked List
        LinkedList<Integer> ll = new LinkedList<>();
        
        // Adding elements in Linked List
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);

        System.out.println(ll);

        // Removing Elements in Linked List
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}