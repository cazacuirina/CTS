public class Bike implements VehicleInterface{
    public Bike(){}
    @Override
    public void drive() {
        System.out.println("Drive bike");
    }

    @Override
    public void stop() {
        System.out.println("Stop bike");
    }


    //Incalcare ISP
    // Can be implemented
//    public void drive() {...}
//    public void stop() {...}


    // Can not be implemented
//    public void refuel() {...}
//    public void openDoors() {...}
}
