package OOPs.OOPS3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Shapes obj =new Shapes();
        // obj.area();

        // Triangle obj2= new Triangle();
        // obj2.area();

        // Square obj3=new Square();
        // obj3.area();

        // What things you access depends on this ...which one of those version to access depend on this..

        Shapes obj4=new Square();
        obj4.area();
        obj4.greetings();

        // Square obj5=new Shapes();
        // obj5.area();
    }
}
