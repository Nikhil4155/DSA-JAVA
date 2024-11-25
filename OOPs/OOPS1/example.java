package OOPs.OOPS1;

class Rectangle{
    int x;
    int h;
    int y;
    int w;

    Rectangle()
    {
        this(0,0,1,1);
    }

    Rectangle(int x,int h,int w,int y)
    {
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;

    }
    Rectangle(int w,int h)
    {
        this(0,w,1,h);
    }
}

class example{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(12,13);
        Rectangle r2=new Rectangle();
        System.out.println(r1.x);
        System.out.println(r1.y);
        System.out.println(r1.w);
        System.out.println(r1.h);
    }
    
}

