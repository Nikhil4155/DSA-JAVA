package OOPs.PracticeQuestions.StaticImplementataion;

public class StaticMain {
    public static void main(String[] args) {
        Stats obj=new Stats();
        obj.display();
        obj.counter();
        System.out.println();
        
        Stats obj2=new Stats(69,"Nikhil Sah",100.f);
        obj2.display();
        obj2.counter();

        Stats obj3=new Stats();
        Stats obj4=new Stats();
        Stats obj5=new Stats();

        obj.counter();


        
        
        
    }
}
