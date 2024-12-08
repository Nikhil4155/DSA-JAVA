package OOPs.OOPS6.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            divide(a,b);  
            throw new Exception("Just for fun") ;     
        }
        // catch (Exception e) {
        //     System.out.println("Normal exception is executed");
        // }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Normal exception is executed");
        }
        // getmessage() refers to the message which is written in the parameterised form while declaring exception like "just for fun"
        // the sopln in catch block is  given more priority than the parameterised form which is written while declaring exception.
        // if the parameterised form is also not written then default message is displayed by java like / by zero for Arith. Except.
        finally{
            System.out.println("This is always executed");
        }

    }

    static int divide(int a,int b) throws ArithmeticException
    {
        if (b==0){
            throw new ArithmeticException("Please do not enter zero");
        }
        return a/b;
    }
}
