package OOPs.OOPS6.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcard<T extends Number>
{
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;

    public void getList(List <? extends Number> list){
        //do something 
        // this is actual wild card by this you can add both Numbers and its subclasses too..
    }

    public Wildcard() {
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
        // Wildcard<String> list  = new Wildcard<String>();
        // Generates Error because String is not part of the Number class that is being extended.Number class is a default class
        // that is defined in java(in built)

        Wildcard<Integer> list  = new Wildcard<Integer>();
        for(int i=0; i<14; i++){
            list.add(2*i);
        }
        System.out.println(list);

        Wildcard<Number> list3  = new Wildcard<Number>();
        list3.add(65);

        Wildcard<Float> list4  = new Wildcard<Float>();
        list4.add(56.258f);



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

