public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();

        shark.eat();
        shark.swim();
    }
}
// Parent Class / Base Class
class Animals{
    String color;

    void eat(){
        System.out.println("It Eats");
    }
    void breathe(){
        System.out.println("It Breathes");
    }
}
// Child class / derived class
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("It Swims");
    }
}