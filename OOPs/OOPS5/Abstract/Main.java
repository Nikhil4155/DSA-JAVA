package OOPs.OOPS5.Abstract;

public class Main {
    public static void main(String[] args) {

        // Parent parent1=new Parent();
        
        
        Son son=new Son(30);
        son.carrer();

        Daughter daughter=new Daughter(28);
        daughter.carrer();

        Parent.hello();

        son.normal();

        //Parent mom=new Parent(44);
    }
}
