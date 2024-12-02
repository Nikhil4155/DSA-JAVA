package OOPs.OOPS5.Interface;

public class Main {
    public static void main(String[] args) {
        
        // // What things you access depends on this ...which one of those version to access depend on this.. It can only acess from engine
        // // even the object is of car type
        // Engine car=new Car(4448,"Audi",1000000.0f);
        // car.start();
        // car.stop();
        // car.acc();
        // car.EngineCondition();
        // Engine.display();
        // // car.displaycarno();

        // System.out.println(Engine.CONSTANT_VALUE);
        // System.out.println(Engine.MESSAGE);

        // System.out.println(car.CONSTANT_VALUE);
        // System.out.println(car.MESSAGE);

        // Media car2=new Car(3096,"mercedes",200000.f);
        // car2.start();

        // // Engine car4=new Engine();
        // // car2.acc();  The method acc() is undefined for the type Media

        // // Engine.EngineCondition(); Cannot make a static reference to the non-static method EngineCondition() from the type Engine
        // // car.display(); //This static method of interface Engine can only be accessed as Engine.display
        // // car.callhelpcenter();
        // // car.dontbrake();

        NiceCar newcar=new NiceCar();

        newcar.start();
        newcar.startMusic();
        newcar.upgradeEngine();
        newcar.start();

        // NiceCar newcar2=new NiceCar(new ElectricEngine());

        ElectricEngine ec_engine=new ElectricEngine();
        // ec_engine.startMusic();
        NiceCar newcar2=new NiceCar(ec_engine);
        newcar2.start();
        newcar2.stop();
        newcar2.startMusic();

        
        

    }
}
