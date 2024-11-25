package OOPs.OOPS5.Interface;

public class Car implements Engine,Brake,Media {

    int carno;
    String carname;
    float price;

    Car(int carno, String carname, float price)
    {
        this.carno=carno;
        this.carname=carname;
        this.price=price;
    }

    @Override
    public void brake() {
        System.out.println("I am going to apply a brake");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal engine car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal engine car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal engine car");
    }
    
}