public class EvenOdd {
    public static void main(String[] args) {
        int number = 12;
        int bitmask = 1;

        if ((bitmask&number) == 0) {
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
