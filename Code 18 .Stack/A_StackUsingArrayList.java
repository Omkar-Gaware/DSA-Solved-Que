import java.util.ArrayList;

public class A_StackUsingArrayList {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // Empty stack
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push 
        public static void push(int data){
            list.add(data);
        }
        // pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;

        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }    
}