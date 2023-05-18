package FactoryMethodVehicle;

public class Bike extends Vehicle{
    boolean hasEngine;
    public Bike(boolean hasEngine) {
        super(hasEngine);
    }

    @Override
    public void ride() {
        System.out.println("Bike ride");
    }
}
