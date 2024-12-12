package OOPs.OOPS2.StaticVariable;

public class StaticVariable {
    int age;
    String name;
    static int population=10;
   // population=15; This gives error because you cannot directly assign a value to a class-level (static) variable outside a method,
   // constructor, or static initializer block but we can assign while initialising.This is equivalent to initializing the variable 
   // in a static initializer block

   static
   {
    System.out.println("Static block is Executed");
    population=15;

   }
    
    public StaticVariable(int age, String name, int population)
    {
        this.age=age;
        this.name=name;
        // this.population=population;
        StaticVariable.population=population; //More appropriate way of defining a static variable
    }

    static void changevalue()
    {
      //  this.population=10250;
      StaticVariable.population=10250;

    }


    void displaymessage()
    {
        System.out.println("Static variable is well explained");
    }
    
}
