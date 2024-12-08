package OOPs.OOPS6.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Nikhil = new Human(20, "Nikhil");
       // Human twin =new Human(Nikhil);

        // System.out.println(twin.age);
        // System.out.println(twin.name);

        // System.out.println(Nikhil.age);
        // System.out.println(Nikhil.name);

        Human twin=(Human)Nikhil.clone();
        System.out.println(twin.age + "   " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;

        System.out.println(Arrays.toString(Nikhil.arr)); // Earlier because of shallow copy both arrays were changed
        System.out.println(Arrays.toString(twin.arr));// now only change is reflected only for twin
        
    }
}
