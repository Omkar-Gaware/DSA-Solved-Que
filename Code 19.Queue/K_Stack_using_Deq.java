import java.util.*;
public class K_Stack_using_Deq {
    
    static class Stack{
        Deque<Integer> deq = new LinkedList<>();

        public void push(int data){
            deq.addLast(data);
        }
        public int pop(){
            return deq.removeLast();
        }
        public int peek(){
            return deq.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
