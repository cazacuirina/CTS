public class Car extends Vehicle implements AutoVehicleInterface{
    private Engine engine;
    public void start() {
        engine.start();
    }
    public Car(String name, double value) {
        super(name, value);
    }
    public Car(String name, double value, Engine e) {
        super(name, value);
        this.engine = e;
    }

    //Incalcare DIP
    /*public class Car {
    private Engine engine;
    public Car(Engine e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}
public class Engine {
   public void start() {...}
}*/

    public double calculateValue() {
        return this.getValue() * 0.8;
    }

    @Override
    public void refuel() {
        System.out.println("Refuel car");
    }

    @Override
    public void openDoors() {
        System.out.println("Open doors car");
    }

    @Override
    public void drive() {
        System.out.println("Drive car");
    }

    @Override
    public void stop() {
        System.out.println("Stop car");
    }
}
