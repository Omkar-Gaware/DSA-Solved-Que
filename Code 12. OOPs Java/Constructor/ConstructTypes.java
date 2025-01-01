package Constructor;

public class ConstructTypes {
    public static void main(String[] args) {
        Student S1 = new Student();
        System.out.println("S1 :Non-Paramitarized Const");
        Student S2 = new Student("Omkar");
        System.out.println("S2 :"+S2.name);
        Student S3 = new Student(39);
        System.out.println("S3 :"+S3.Roll);
        
    }
}
class Student{
    String name;
    int Roll;

    Student(){
        
    }
    Student(String Name){   // Paramitarized
        this.name = Name;
    }
    Student(int Rollno){   //Paramitarized
        this.Roll = Rollno;
    }
}
