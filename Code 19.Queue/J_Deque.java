import java.util.*;
public class J_Deque {
    public static void main(String[] args) {
        Deque<Integer> Deq = new LinkedList<>();
        Deq.addFirst(1);
        Deq.addFirst(2);
        Deq.addLast(3);
        Deq.addLast(4);

        System.out.print(Deq);
    }
}
