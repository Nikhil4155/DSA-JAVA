package OOPs.OOPS6.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList 
{
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;

    public CustomArrayList() {
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
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
            int temp[]=new int[data.length*2];
            for(int i=0; i<data.length; i++)
            {
                temp[i]=data[i];
            }
            data=temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }



    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();

        // list.add(3);
        // list.add(5);
        // list.add(25);

        for(int i=0; i<14; i++){
            list.add(2*i);
        }
        System.out.println(list);
        
    }
}
