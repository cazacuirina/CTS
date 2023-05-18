package BuilderV3;

public class Pizza {
    boolean hasPepperoni;
    boolean hasCheese;
    double price;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.hasPepperoni = pizzaBuilder.hasPepperoni;
        this.hasCheese = pizzaBuilder.hasCheese;
        this.price = pizzaBuilder.price;
    }

    public static PizzaBuilder getBuilder(){
        return new PizzaBuilder();
    }
    public static class PizzaBuilder implements Builder{
        boolean hasPepperoni;
        boolean hasCheese;
        double price;

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
            return new Pizza(this);
        }
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
