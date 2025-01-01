package Abstraction;

public class Que {
    public static void main(String[] args) {
        Bear B = new Bear();
        B.eats();
    }
}
interface Carnival{
    void eats();
}
interface Hurbivorous{
    void eats();
}
class Bear implements Carnival,Hurbivorous{
    public void eats(){
        System.out.println("Eat Both Grass and Meat .");
    }
}