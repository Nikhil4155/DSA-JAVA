package OOPs.OOPS3.Inheritance;

public class Box {
    float l;
    float w;
    float h;

    Box()
    {
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    Box(float side)
    {
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(Box other)
    {
        this.l=other.l;
        this.w=other.w;
        this.h=other.h;
    }

    Box(float l, float w, float h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

    static void greetings()
    {
        System.out.println("I am in Box Class");
    }
}
