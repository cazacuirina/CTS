package FactoryMethodVehicle;

public class Car extends Vehicle{
    boolean hasEngine;
    public Car(boolean hasEngine) {
        super(hasEngine);
    }

    @Override
    public void ride() {
        System.out.println("Car ride");
    }
}
