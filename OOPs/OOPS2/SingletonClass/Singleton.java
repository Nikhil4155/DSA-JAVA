package OOPs.OOPS2.SingletonClass;

public class Singleton {
    
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance()
    {
        // checks whether only 1 object is created or not
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
