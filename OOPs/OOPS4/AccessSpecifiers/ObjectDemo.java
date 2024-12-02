package OOPs.OOPS4.AccessSpecifiers;

public class ObjectDemo {

    int num;
    String name;

    

    public ObjectDemo(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(12, "Random");
        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj.getClass().getConstructors());
    }


    
}
