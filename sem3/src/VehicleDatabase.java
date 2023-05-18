public class VehicleDatabase extends Vehicle{
    private double value;
    private String name;
    public VehicleDatabase(String name, double value){
        super(name, value);
    }
    public void addVehicleToDB() {
        System.out.println(getName()+" added to database");
    }
}
