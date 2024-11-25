package OOPs.OOPS5.Interface;

import java.lang.classfile.Interfaces;

public interface Engine {


    // Variables in interfaces are implicitly public, static, and final
    int CONSTANT_VALUE = 100; // Initialized to 100
    String MESSAGE = "Hello, Interface!";
   // private int number=10;  Illegal modifier for the interface field Engine.number; only public, static & final are permitted

    // final void start();
    // If a method in an interface were marked as final, it would prevent any implementing class from overriding that method, 
    //defeating the purpose of the interface itself.
    void start();
    void stop();
    void acc();

    // Interfaces cannot have constructors
    // Engine(int CONSTANT_VALUE,String MESSAGE)
    // {
    //     this.CONSTANT_VALUE=CONSTANT_VALUE;
    //     this.MESSAGE=MESSAGE;
    // }

    static void display()
    {
        System.out.println("This is an interface class");
    }

    default void EngineCondition()
    {
        System.out.println("The Engine Condition is Excellent");
    }

    private void callhelpcenter()
    {
        System.out.println("Emergency: I need help");
    }

    //Declaration of Normal Methods is not possibleNot possible
    // void display()
    // {
    //     System.out.println("This is an interface class");
    // }
}
