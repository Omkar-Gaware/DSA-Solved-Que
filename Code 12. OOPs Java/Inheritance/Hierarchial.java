
public class Hierarchial {
    public static void main(String[] args) {
        Birds bd = new Birds();
        bd.name = "Peacock";
        System.out.println(bd.name);
        bd.Fly();
        bd.eat();
        bd.breathe();

        System.out.println();
        
        Fish f = new Fish();
        f.name = "Rohu";
        System.out.println(f.name);
        f.swim();
        f.breathe();

        System.out.println();

        Mamals ma = new Mamals();
        ma.name= "Cow";
        System.out.println(ma.name);
        ma.walk();
        ma.breathe();
    }
}
class Animals{
    
    void eat(){
        System.out.println("It Eats");
    }
    void breathe(){
        System.out.println("It Breathes");
    }
}
class Birds extends Animals{
    String name;
    void Fly(){
        System.out.println("It Fly's");
    }
}
class Fish extends Animals{
    String name;
    void swim(){
        System.out.println("It Swims");
    }
}
class Mamals extends Animals{
    String name;
    void walk(){
    System.out.println("It walks");
    }
}