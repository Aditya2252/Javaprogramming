public class classob{
    public static void main(String[] args) {
        // System.out.println("Hello world");
        Student s1=new Student();
        s1.name="Aditya";
        s1.roll=101;
        s1.password="1234";

        // Student s2=new Student("Aditya");
        // Student s3=new Student(123);

        Student s2=new Student(s1);

    }
}
class Student{
    String name;
    int roll;
    String password;
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }
}

class Student{
    String name;
    int roll;
    Student(){
       System.out.println("String is called");

    }
    Student(String name){
        this.name=name;
    }

    Student (int roll){
        this.roll=roll;

    }

}