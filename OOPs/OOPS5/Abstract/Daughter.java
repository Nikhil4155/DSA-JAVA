package OOPs.OOPS5.Abstract;

public class Daughter extends Parent {

    Daughter(int age)
    {
        super(age);
    }

    @Override
    void carrer()
    {
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partner(){
        System.out.println("I love Iron Man");
    }
    
}
