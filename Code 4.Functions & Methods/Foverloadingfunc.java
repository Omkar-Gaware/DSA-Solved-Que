public class Foverloadingfunc {
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.print(sum(5,6,9));
    }
    // func of sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }
    // func of sum of 3 numbers
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
}
