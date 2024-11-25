package OOPs.OOPS5.Interface;

public class Main {
    public static void main(String[] args) {
        
        // What things you access depends on this ...which one of those version to access depend on this.. It can only acess from engine
        // even the object is of car type
        Engine car=new Car(4448,"Audi",1000000.0f);
        car.start();
        car.stop();
        car.acc();
        car.EngineCondition();

        System.out.println(Engine.CONSTANT_VALUE);
        System.out.println(Engine.MESSAGE);

        // System.out.println(car.CONSTANT_VALUE);
        // System.out.println(car.MESSAGE);

        // car.callhelpcenter();
        // car.display(); //This static method of interface Engine can only be accessed as Engine.display
        // car.dontbrake();
        
        

    }
}
