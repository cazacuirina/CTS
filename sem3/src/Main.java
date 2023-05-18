public class Main {
    public static void main(String[] args) {

        Vehicle vehicle=new Vehicle("Vehicle", 200.0);
        System.out.println(vehicle.toString());

        // SRP: Single responsibility principle
        //3 clase separate pentru 3 obiective diferite:
        //VehicleReport - print details, VehicleCalculation - calculate value, VehicleDatabase - add to database
        System.out.println("SRP");

        VehicleReport vehicleReport=new VehicleReport("Vehicle report", 300);
        vehicleReport.printDetails();

        VehicleCalculations vehicleCalculations=new VehicleCalculations("Vehicle calculations", 300);
        System.out.println("Vehicle value: "+vehicleCalculations.calculateValue());

        VehicleDatabase vehicleDatabase=new VehicleDatabase("Vehicle database", 300);
        vehicleDatabase.addVehicleToDB();


        // OCP: Open-closed principle
        //Implementarea metodei calculateValue diferit pentru fiecare clasa derivata din vehicle
        //Nu mai e nevoie sa modificam IF-uri / SWITCH-uri in care verificam tipul instantei
        System.out.println("OCP");

        Car car=new Car("Car", 500);
        System.out.println("Car Value: "+car.calculateValue());

        Truck truck=new Truck("Truck", 500);
        System.out.println("Truck Value: "+truck.calculateValue());


        // LSP: Liskov substitution principle
        //NU avem aceleasi proprietati - NU sunt substituibile
        //Creare interfata Capacity pt a implementa diferit in functie de calculul capacitatii
        //Freight Train: width*height - capacitate in numar de tone (volum)
        //Train: passengers - capacitate in numar de persoane
        System.out.println("LSP");

        FreightTrain freightTrain=new FreightTrain(100, 200);
        freightTrain.getCapacity();

        Train train=new Train(300);
        train.getCapacity();

        // ISP: Interface segregation principle
        //Separare pe interfete mai mici care sa nu impuna implementarea de metode inutile
        //Bike - implementeaza VehicleInterface - doar drive si stop
        //Car - implementeaza AutoVehicleInterface -  drive, stop, openDoors, refuel
        System.out.println("ISP");

        Bike bike=new Bike();
        bike.drive();
        bike.stop();

        car.drive();
        car.stop();
        car.openDoors();
        car.refuel();

        // DIP: Dependency inversion principle
        //Abstactizare: interfata Engine pentru ca apoi sa putem implementa si PetrolEngine si DieselEngine in functie de masina
        //Nu mai suntem nevoiti sa schimbam clasa Car
        System.out.println("DIP");

        Car dieselCar=new Car("Diesel Car", 500.5, new DieselEngine());
        dieselCar.start();

        Car petrolCar=new Car("Petrol Car", 500.5, new PetrolEngine());
        petrolCar.start();

    }

}