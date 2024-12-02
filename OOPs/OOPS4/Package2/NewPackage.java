package OOPs.OOPS4.Package2;
import OOPs.OOPS4.AccessSpecifiers.A;

public class NewPackage extends A
{
    NewPackage(int age,int num, String name)
    {
        super(age,num, name);
    }

    public static void main(String[] args) 
    {
        
        NewPackage obj=new NewPackage(21,50,"Rahul Sinha");
       
        // A obj=new A(21,50,"Rahul Sinha");
        // A obj=new NewPackage(21,50,"Rahul Sinha");
        // In both the cases the variable age cannot be accessed because it is protected in class A.
        // In case if the protected variable is accessed in diff package then it can only be accessed with subclass or childclass 
        // object and childclass reference type .

        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.getnum());
        // System.out.println(obj.num);//Private object cannot be accessed outside the class but it can be accessed with the help of 
        // getters and setters.
    }
}