package OOPs.OOPS1;

public class oops1 {
    
    public static void main(String args[])
    {
        Student student1=new Student(69, "Nikhil Sah", 99.0f);
        student1.display();
        // System.out.println(student1.rno);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);

        // student1.greetings();
        // student1.changename("Namit");
        // student1.greetings();

        Student student3=new Student(25,"Rahul Singhania",100.f);

        Student student2=new Student(student3);
        student2.display();

        Student student4=new Student();
        student4.display();

        // Student student3=new Student(25,"Rahul Singhania",100.f);



        // Student student2=new Student();
        // System.out.println(student2.rno);
        // System.out.println(student2.name);
        // System.out.println(student2.marks);


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

    // Student(int roll,String naam, int num)
    // {
    //     rno=roll;
    //     name=naam;
    //     marks=num;
    // }
    
    // void greetings()
    // {
    //     System.out.println("Hello My name is "+this.name);
    // }

    // void changename(String name)
    // {
    //     this.name=name;
    // }

    Student(Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }

    Student(){
        //this is how you call a constructor from another constructor
        //internally: new Student(13,"default person",100.0)
        this(13, "default person" , 100.0f);
    }

    Student (int rno, String name, float marks)
    {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }

    void display()
    {
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}

