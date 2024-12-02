package OOPs.OOPS4.AccessSpecifiers;

public class A {
    protected int age;
    private int num;
    public String name;
    public int[] arr;
    
    public A(int age,int num,String name)
    {
        this.age=age;
        this.num=num;
        this.name=name;
        arr=new int[num];
    }

    // Getters and Setters in Java
    // Since private members are not directly accessible so getters and setters are used to access this members

    public int getnum()
    {
        return num;      //Getter in Java
    }

    public void setnum(int num2)
    {
        this.num=num2;          // Setters in Java
    }
}
