public class Gdataoverloading {
    public static void main(String[] args) {
        System.out.println(sum(5,8));
        System.out.println(sum(5.1f,8.9f));
    }
    //sum to calculate int value
    public static int sum(int a,int b){
        return a+b;
    }
    //sum to calculate float value
    public static float sum(float a,float b){
        return a+b;
    }
}
