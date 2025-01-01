public class setbit {
    public static void main(String[] args) {
        System.out.println(Setbit(16));
    }
    public static int Setbit(int n){
        int count = 0;
        while (n>0) {
            if ((n&1)!=0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
