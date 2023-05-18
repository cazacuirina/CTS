public class Truck extends Vehicle {
    public Truck(String name, double value) {
        super(name, value);
    }

    public double calculateValue() {
        return this.getValue() * 0.6;
    }
}
