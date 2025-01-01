public class Setith {
    public static void main(String[] args) {
        int i = 2;
        int bitmask = 1<<i;
        int number = 10; // 1010
        
        System.out.println(number | bitmask);
    }
}
