package OOPs.OOPS6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafunc {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arr =new ArrayList<Integer>();
        for(int i=1; i<=5; i++)
        {
            arr.add(2*i);
        }

        //arr.forEach((ans) -> System.out.println(ans*2));

        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        arr.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation pro = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;

        Lambdafunc mycalc = new Lambdafunc();
        System.out.println(mycalc.operate(5,3, sum));
        System.out.println(mycalc.operate(5,3, pro));
        System.out.println(mycalc.operate(5,3, sub));
        
    }

    private int operate(int a,int b, Operation op)
        {
            return op.operation(a, b);
        }

}

interface Operation{
    int operation(int a, int b);
}
