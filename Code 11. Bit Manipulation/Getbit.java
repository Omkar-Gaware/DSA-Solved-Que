public class Getbit {
    public static void main(String[] args) {
        int i = 2;  // 5th position
        int getbit = (1<<i);
        int number = 4; // 100 bitnum

        if ((number & getbit) == 0) {
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}