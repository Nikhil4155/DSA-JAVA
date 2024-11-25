package OOPs.OOPS3.Inheritance;

public class Boxweight extends Box {
    float weight;
    Boxweight()
    {
        this.weight=-1;
    }

    // Boxweight(float l, float w, float h,float weight)
    // {
    //     super(l,w,h);
    //     this.weight=weight;
    // }

    Boxweight(float l,float w,float h,float  weight)
    {
        super(l,w,h);
        this.weight=weight;
    }

    // @Override
    static void greetings()
    {
        System.out.println("I am in Boxweight Class");
    }


}
