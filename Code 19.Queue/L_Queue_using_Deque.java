import java.util.*;
public class L_Queue_using_Deque {
    
    static class Queue{
        Deque<Integer> deq = new LinkedList<>();

        public void add(int data){
            deq.addLast(data);
        }
        public int remove(){
            return deq.removeFirst();
        }
        public int peek(){
            return deq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}
