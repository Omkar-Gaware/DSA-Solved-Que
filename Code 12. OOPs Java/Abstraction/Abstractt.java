package Abstraction;

public class Abstractt {
    public static void main(String [] args){
        Horse H = new Horse();
        H.eats();
        H.legs();

        Hen h = new Hen();
        h.eats();
        h.legs();
    }    
}
// Parent Class
abstract class Animal{  
    void eats(){
        System.out.println("It Eats :");
    }
    abstract void legs() ; //  Every Anstraction child class has compansary to mention Legs
}
// Child Class
class Horse extends Animal{  
    void legs(){            
        System.out.println("Horse having 4 Legs"); 
    }
}
// Child class
class Hen extends Animal{
    void legs(){
        System.out.println("Hen having 2 Legs");
    }
}