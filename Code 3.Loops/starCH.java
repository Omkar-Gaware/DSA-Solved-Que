public class starCH {
    public static void main(String[] args) {
        
        int n=4;
        char ch='A';

        //outer loop
        for(int line=1; line<=n; line++){
            //inner loop
            for(int letter=1; letter<=line; letter++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
