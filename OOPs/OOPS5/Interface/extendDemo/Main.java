package OOPs.OOPS5.Interface.extendDemo;

public class Main implements A,B{

    @Override
    public void greet() {
        
    }

    @Override
    public void fun() {
       
    }

    // Basically when we implement both the interfaces then we have to declare all the methods present present in both the interface
    // we used word extends while declaring interface B so it behaves like normal inheritance concept that :
    // B has both the methods fun() and greet()
    
}
