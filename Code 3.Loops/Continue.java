import java.util.*;
public class Continue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        for( int j = 1 ; j<10 ; j++){
            if(j==5){
                continue;
            }
            System.out.println(j);
        }
        in.close();
    }
}
