public class Hybrid {
    public static void main(String[] args) {
        Gate gt = new Gate();
        gt.postgradu();
        gt.Coding();
        gt.money();
        gt.parents();
    }
}
class Sucess{
    void money(){
        System.out.println("It takes money.");
    }
    void happyness(){
        System.out.println("It takes Happyness");
    }
    void parents(){
        System.out.println("Your parents are Happy");
    }
}
class Engineering extends Sucess{
    void Coding(){
        System.out.println("Good At Coading.");
    }
    void Communi(){
        System.out.println("Good At Communication");
    }
}
class Gate extends Engineering{
    void postgradu(){
        System.out.println("You Do Post Graduation");
    }
}
class Doctor extends Sucess{
    void Biology(){
        System.out.println("Good At Biology");
    }
    void Chem(){
        System.out.println("Good At Chemistry");
    }
}
