public class ClearLastDigit {
    public static void main(String[] args) {
        System.out.println(cleardigit(15, 2));
    }
    public static int cleardigit(int n, int pos){
        int bitmask = ~0<<pos ;
        return bitmask & n;
    }
}