public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(poweroftwo(8));
    }
    public static Boolean poweroftwo(int n){
        return (n & (n-1)) == 0;
    }
}
