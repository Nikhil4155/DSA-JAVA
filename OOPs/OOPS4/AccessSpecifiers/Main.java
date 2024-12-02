package OOPs.OOPS4.AccessSpecifiers;

public class Main {
    public static void main(String[] args) {
        A obj = new A(20,34,"Nikhil Sah");
        System.out.println(obj.name);
        int n=obj.getnum();
        System.out.println(n);
        obj.setnum(69);
        System.out.println(obj.getnum());
    }
}
