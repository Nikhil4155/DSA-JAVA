package OOPs.OOPS4.AccessSpecifiers;

public class Subclass extends A 
{
    Subclass(int age,int num, String name)
    {
        super(age,num, name);
    }

    public static void main(String[] args) 
    {
        A obj=new Subclass(21,50,"Rahul Sinha");
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.getnum());
        // System.out.println(obj.num); Private object cannot be accessed outside the class but it can be accessed with the help of 
        // getters and setters.
   }
}