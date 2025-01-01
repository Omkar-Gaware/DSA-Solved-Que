public class MethodOverriding {
    public static void main(String[] args) {
        Deer D = new Deer();
        D.eats();        
    }
} 
class Animal{
    void eats(){
        System.out.println("It eats anything");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("It eats Grass");
    }
}