public class OOPS { 
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.setcolor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Student sc = new Student();
        sc.calculateCGPA(5,10,3);
    }
}
class Pen{
    // Attributes + Functions
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float CGPA;

    void calculateCGPA(int phy, int chem, int maths){
        CGPA = (phy + chem + maths)/3;
        System.out.println(CGPA);
    }
}