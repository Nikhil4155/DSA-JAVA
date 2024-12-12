package OOPs.OOPS6.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T>
{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;

    public CustomGenArrayList() {
        data=new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()) {
            resize();
        }
        data[size++]=num;
    }
    
    public boolean isFull()
    {
        return size == data.length;
    }

    public void resize()
    {
            // size=size*2;
            Object[] temp=new Object[data.length*2];
            for(int i=0; i<data.length; i++)
            {
                temp[i]= data[i];
            }
            data=temp;
    }

    public T remove() {
        
        T removed = (T)(data[--size]);
        return removed;
    }



    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) 
    {

        CustomGenArrayList<Integer> list  = new CustomGenArrayList<Integer>();
        // list.add("Nikhil Sah");
        // list.add("Namit Sah");
        for(int i=0; i<14; i++){
            list.add(2*i);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        System.out.println(list2);
        // ArrayList list =new ArrayList();
        // list.add(56);
        // list.add(45);
        // list.add(5);
        // list.remove(2);
        // System.out.println(list);
        // list.clear();
        // System.out.println(list);
    }
}
