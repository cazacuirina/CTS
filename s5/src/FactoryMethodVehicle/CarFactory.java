package FactoryMethodVehicle;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car(true);
    }
}
