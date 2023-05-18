package SimpleFactoryPizza;

public class VeggiePizza implements Pizza{
    @Override
    public void describePizza() {
        System.out.println("Veggie Pizza");
    }
}
