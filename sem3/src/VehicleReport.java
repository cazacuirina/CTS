public class VehicleReport extends Vehicle{
    private double value;
    private String name;
    public VehicleReport(String name, double value){
        super(name, value);

    }
    public void printDetails() {
        System.out.println("Vehicle details: "+super.toString());
    }
}
