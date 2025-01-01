public class ConsecutiveString {
    public static void main(String[] args) {
        Binay(3, 0, "");
    }
    public static void Binay(int n, int lastdigit, String str){
        //Base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // kaam
        Binay(n-1, 0, str+"0");
        if (lastdigit ==0) {
            Binay(n-1, 1, str+"1");
        }
    }
}
