package OOPs.OOPS6.Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Nikhil = new Student(1, 99.04f);
        Student Rahul = new Student(2, 89.014f);
        Student Arpit =new Student(25, 94.54f);
        Student Aniket =new Student(15, 95.54f);
        Student Aashish =new Student(10, 99.54f);

        Student[] list={Nikhil,Rahul,Arpit,Aniket,Aashish};


        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    
    // The above written lines from 23-29 can be implemented without using interface comparable

        // System.out.println(Arrays.toString(list));
        // Arrays.sort(list,new Comparator<Student>() {
        //     public int compare(Student o1,Student o2){
        //         return -(int)(o1.marks-o2.marks);
        //     }
        // });
        // System.out.println(Arrays.toString(list));

    // The above commented functions can be replaced with the single line code known as lambda functions

        Arrays.sort(list, (o1,o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

        
        

        // if (Nikhil.compareTo(Rahul) > 0){
        //     System.out.println(Nikhil.compareTo(Rahul));
        //     System.out.println("Nikhil has more marks");
        // }
        
        
    }
    
}
