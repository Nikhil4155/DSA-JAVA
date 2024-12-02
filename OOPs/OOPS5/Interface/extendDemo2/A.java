package OOPs.OOPS5.Interface.extendDemo2;

public interface A {

    default void fun()
    {
        System.out.println("I am in A");
    }
    // Static interface methods should always have a body
    //call via the interface name 

    static void greetings(){
        System.out.println("Hey I am in Static method");
    }
}
