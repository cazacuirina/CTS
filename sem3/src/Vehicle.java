public class Vehicle {
    private String name;
    private double value;

    public Vehicle(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
