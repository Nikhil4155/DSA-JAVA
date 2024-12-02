package OOPs.OOPS5.Interface.extendDemo2;

public class Main implements A,B {

    // Duplicate default methods named fun with the parameters () and () are inherited from the types B and A

    // But obviously class implementing will be more given priority over an interface default method..
    public void greet()
    {
        System.out.println("Hello Everyone");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        A.greetings();
    }

}
