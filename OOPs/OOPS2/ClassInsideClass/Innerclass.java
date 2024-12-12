package OOPs.OOPS2.ClassInsideClass;

public class Innerclass {
    
    public static class Test{
        String name;
        
        Test(String name)
        {
            this.name=name;
        }

        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        
        Test a = new Test("Nikhil");
        Test b =new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
        System.out.println(b);


    }
}
