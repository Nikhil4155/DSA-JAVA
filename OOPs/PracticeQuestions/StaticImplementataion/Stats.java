package OOPs.PracticeQuestions.StaticImplementataion;

public class Stats {
    int roll;
    String name;
    float percent;
    static int count;

    static{
        Stats.count=0;
        System.out.println("Static Block  is executed");
    }

    Stats(int roll, String naam, float p)
    {
        this.roll=roll;
        this.name=naam;
        this.percent=p;
        Stats.count=count + 1;
    }

    Stats()
    {
        Stats.count+= 1;
    }

    void counter(){
        System.out.println("Total Number of objects created:"+ Stats.count);
    }

    void display()
    {
        System.out.println(this.roll);
        System.out.println(this.name);
        System.out.println(this.percent);
        System.out.println(Stats.count);
    }
}
