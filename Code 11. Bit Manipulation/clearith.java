public class clearith {
    public static void main(String[] args) {
        int i=1;
        int bitnum = ~(1<<i);
        int number = 10; //1010

        System.out.println(number & bitnum);
    }
}
