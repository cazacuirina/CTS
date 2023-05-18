package FactoryMethodVehicle;

public abstract class Vehicle {
    boolean hasEngine;

    public Vehicle(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    public void ride(){
        System.out.println("Has engine: "+this.hasEngine);
    }
}
