import java.util.Stack;

public class J_Duplicate_Parentheses {
    public static void main(String[] args) {
        String str = "(((a+b) + c))";
        System.out.println(Duplicate(str));
    }
    public static boolean Duplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i =0 ;i<str.length(); i++){
            char ch = str.charAt(i);
            
            // Closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count<1) {
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
}