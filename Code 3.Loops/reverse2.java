import java.util.*;
public class reverse2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int rev = 0;
        int n=in.nextInt();
        while (n>0) {
            int lastdigit = n % 10;
            rev = (rev*10) + lastdigit ;
            n/=10;
        }
        System.out.println(rev);
        in.close();
    }
}
