package OOPs.OOPS6.Comparable;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno=rollno;
        this.marks=marks;
    }

    

    @Override
    public String toString() {
        return marks+" ";
    }



    @Override
    public int compareTo(Student o) {
        int diff =(int)(this.marks - o.marks);
        return diff;

        // if diff < 0 then o is smaller than the this.student
        // if diff = 0 means both are equal
    }

}
