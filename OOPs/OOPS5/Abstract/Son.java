package OOPs.OOPS5.Abstract;

public class Son extends Parent {

    Son(int age)
    {
        super(age);
    }

    @Override
    void carrer()
    {
        System.out.println("I want to be a Coder");
    }

    @Override
    void partner()
    {
        System.out.println("I love angels");
    }
    
}
