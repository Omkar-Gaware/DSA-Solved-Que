package Constructor;

public class CopyConst {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.name = "omkar";
        sc.age=19;
        
    }
}
class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor is Called...");
        System.out.println(name);
        System.out.println(age);

    }
}