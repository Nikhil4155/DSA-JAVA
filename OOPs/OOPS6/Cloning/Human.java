package OOPs.OOPS6.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name)
    {
        this.age=age;
        this.name=name;
        this.arr=new int[]{1,2,3,4,5,6};
    }

    Human (Human other)
    {
        this.age=other.age;
        this.name=other.name;
    }


    //This creates Shallow copy
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }

    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone(); // This is shallow copy

        // makes a deep copy
        twin.arr=new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
}
