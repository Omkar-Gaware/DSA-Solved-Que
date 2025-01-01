public class Kdecimaltobin {
    public static void main(String[] args) {
        dectobin(7);
    }
    public static void dectobin(int n ){
        int  mynumber=n;
        int pow=0;
        int binary=0;

        while(n>0){
            int rem = n % 2;
            binary = binary + (rem * (int)Math.pow(10, pow));
            pow++;
            n/=2;
        }
        System.out.println("binary of "+ mynumber+" = " + binary);
    }
}
