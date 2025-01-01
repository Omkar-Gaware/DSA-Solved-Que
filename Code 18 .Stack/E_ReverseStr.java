import java.util.*;
public class E_ReverseStr {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idex = 0;
        while (idex<str.length()) {
            s.push(str.charAt(idex));
            idex++;
        }

        StringBuilder newString = new StringBuilder();

        while (!s.isEmpty()) {
            char curr = s.pop();
            newString.append(curr);
        }

        return newString.toString();
    }
    public static void main(String[] args) {
        String str = "Omkar";

        String newStr = reverseString(str);
        System.out.println((newStr));
    }
}
