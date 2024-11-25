package OOPs.OOPS2;

public class Main {
    
    public static void main(String[] args) {
        Human Nikhil=new Human(20, "Nikhil Sah", 10000, false);

        Human Namit=new Human(17,"Namit",15000,false);

        System.out.println(Human.population);
        System.out.println(Human.population);

        // greetings();
        callname();
    }

    void greetings()
    {
       System.out.println("Hello How are you?");
       callname();
    }

    static void callname()
    {
        System.out.println("Hey my name is Nikhil Sah");
    }
}
