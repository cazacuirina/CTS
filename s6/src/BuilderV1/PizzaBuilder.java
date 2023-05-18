package BuilderV1;

public class PizzaBuilder implements Builder{
    Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza(false, false, 0);
    }

    public PizzaBuilder setHasPepperoni(boolean hasPepperoni){
        this.pizza.hasPepperoni=hasPepperoni;
        return this;
    }

    public PizzaBuilder setHasCheese(boolean hasCheese){
        this.pizza.hasCheese=hasCheese;
        return this;
    }
    public PizzaBuilder setPrice(double price){
        this.pizza.price=price;
        return this;
    }

    @Override
    public Pizza createPizza() {
        return this.pizza;
    }
}
