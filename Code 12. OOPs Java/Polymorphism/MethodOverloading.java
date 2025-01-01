public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5,6));
        System.out.println(cal.sum((float)5.9, (float)0.1));
        System.out.println(cal.sum(5, 9,6));
    }    
}
class Calculator{
    int sum(int a,int b){
        return a + b ;
    }
    float sum(float a, float b){
        return a + b ;
    }
    int sum(int a, int b, int c){
        return a + b + c ;
    }
}