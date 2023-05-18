package BuilderV2;

public class PizzaBuilder implements Builder{
    boolean hasPepperoni;
    boolean hasCheese;
    double price;

    public PizzaBuilder() {
        this.hasPepperoni = false;
        this.hasCheese = false;
        this.price = 0;
    }

    public PizzaBuilder setHasPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
        return this;
    }

    public PizzaBuilder setHasCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
        return this;
    }

    public PizzaBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(hasPepperoni, hasCheese, price);
    }
}
