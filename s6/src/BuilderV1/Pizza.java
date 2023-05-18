package BuilderV1;

public class Pizza {
    boolean hasPepperoni;
    boolean hasCheese;
    double price;

    public Pizza(boolean hasPepperoni, boolean hasCheese, double price) {
        this.hasPepperoni = hasPepperoni;
        this.hasCheese = hasCheese;
        this.price = price;
    }

    public void setHasPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
    }

    public void setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "hasPepperoni=" + hasPepperoni +
                ", hasCheese=" + hasCheese +
                ", price=" + price +
                '}';
    }


}
