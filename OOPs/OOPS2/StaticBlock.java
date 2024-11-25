package OOPs.OOPS2;

public class StaticBlock {
    static int a=4;
    static int b;

    // Will run only once when the first object is created i.e when the class is loaded for the first time
    static{
        System.out.println("I am in Static Block");
        b=a*5;
    }

    public static void main(String[] args) {

        
        System.out.println("Hello world");
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b+=3;

        System.out.println(StaticBlock.a+ " " + StaticBlock.b);

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+ " " + StaticBlock.b);


        // These lines of code also result in same output
        // StaticBlock obj=new StaticBlock();
        // System.out.println(obj.a + " " + obj.b);

        // obj.b+=3;

        // System.out.println(obj.a+ " " + obj.b);

        // StaticBlock obj2=new StaticBlock();
        // System.out.println(obj2.a+ " " + obj2.b);


    }
}
