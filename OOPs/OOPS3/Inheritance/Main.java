package OOPs.OOPS3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1=new Box();
        // Box b2=new Box(5.5f,4.5f,9.2f);

        // Box b3=new Box(5);
        // Box b4=new Box(b3);

        System.out.println(b1.h+"  " + b1.l + " "+ b1.w);

        Boxweight box2=new Boxweight();
        System.out.println(box2.h+"  " + box2.w + " "+ box2.weight);
        
        // Boxweight box3=new Boxweight(2);
        // System.out.println(box3.h+"  " + box3.w + " "+ box3.weight);

        Box box4=new Boxweight(2,3,5,6);
        System.out.println(box4.h+"  " + box4.w + " "+ box4.l);
        // System.out.println(box4.weight); //This code gives error...Because box4 is a ref variable type of Box and it is refrencing 
        // to an object of type Boxweight ... so basically its the type of ref variable which determines not the object so we have 
        // access to the elements of Box only like l,w,h...

        // Boxweight box5=new Box(2,3,4);
        // System.out.println(box5.h+"  " + box5.w + " "+ box5.l);
        //In this case we have ref variable of Boxweight and the object of Box class and its known to us that parent class object cannot
        // access the elements of child class....

        Boxprice box6=new Boxprice(5,4,8,9,8);
        System.out.println(box6.l+"  " + box6.w + " "+ box6.h + " "+ box6.weight +" "+box6.cost);

        Boxprice box7=new Boxprice();
        System.out.println(box7.l+"  " + box7.w + " "+ box7.h + " "+ box7.weight +" "+box7.cost);

        Box box8=new Box();
        box8.greetings();

        Boxweight box9=new Boxweight();
        box9.greetings();

        Box box10=new Boxweight();
        box10.greetings();

        Box.greetings();
        Boxweight.greetings();

    }
}
