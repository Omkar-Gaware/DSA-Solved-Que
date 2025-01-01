public class JbinTodec {
    public static void main(String[] args) {
        bintodec(111);
    }
public static void bintodec(int binnum){
    int mynumber=binnum;
    int decimal=0;
    int power=0;
    while (binnum>0) {
        int lastdigit= binnum%10;
        decimal = decimal +(lastdigit*(int)Math.pow(2, power));
        power++;
        binnum/=10;
    }
    System.out.println("Decimal of "+mynumber+" = "+decimal );
}
}