package OOPs.OOPS5.Abstract;

public abstract class Parent {

    int age;
    Parent(int age)
    {
        this.age=age;
    }

    static void hello()
    {
        System.out.println("hello world");
    }

    void normal()
    {
        System.out.println("Hey this is a normal function");
    }

    // static abstract void greetings()
    {
        System.out.println("Hey");
    }

    //Abstract Methods are created
    abstract void carrer();
    abstract void partner();
}
