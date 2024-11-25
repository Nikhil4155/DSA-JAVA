public class Main {
    public static void main(String args[])
    {
        Student student1=new Student(69, "Nikhil Sah", 99.0f);
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        student1.greetings();
        student1.changename("Namit");
        student1.greetings();

        Student student2=new Student();
        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);


        // System.out.println(student1.rno);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);

        // Student namit=new Student();
        // namit.name="Namit Sah";
        // namit.marks=98;   
        // System.out.println(namit.rno);
        // System.out.println(namit.name);
        // System.out.println(namit.marks);

    }
    
}

class Student
{
    int rno;
    String name;
    float marks;

    Student()
    {
        this.rno=54;
        this.name="Aasish";
        this.marks=100.0f;
    }
    
    void greetings()
    {
        System.out.println("Hello My name is "+this.name);
    }

    void changename(String name)
    {
        this.name=name;
    }

    Student(Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }

    // Student(){
    //     //this is how you call a constructor from another constructor
    //     //internally: new Student(13,"default person",100.0)
    //     this(13, "default person" , 100.0f);
    // }

    Student (int rno, String name, float marks)
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}
