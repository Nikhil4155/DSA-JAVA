package OOPs.OOPS5.Interface;

public interface Brake {

    void brake();

    static void dontbrake()
    {
        System.out.println("Braking is not possible");
    }

    //Conclusion is that
    //Static methods are only supported in interfaces in java after java 8 version and normal methods are supported like we could do
    //in abstraction.

}
