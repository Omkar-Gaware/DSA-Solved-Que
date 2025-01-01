import java .util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        while(i>0){
            int lastdigit = i%10;
            System.out.print(lastdigit);
            i = i / 10;
        }
        in.close();
    }
}
