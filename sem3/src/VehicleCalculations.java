public class VehicleCalculations extends Vehicle{
    //Vehicle vehicle;

    private double value;
    private String name;
    public VehicleCalculations(String name, double value){
        super(name, value);

    }
    public double calculateValue() {
        return getValue()*0.5;
    }

    //Incalcare OCP
//    public double calculateValue(Vehicle v) {
//        if (v instanceof Car) {
//            return v.getValue() * 0.8;
//            if (v instanceof Bike) {
//                return v.getValue() * 0.5;
//            }
//        }
//        return 0;
//    }

}
