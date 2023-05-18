package SimpleFactoryPizza;

public class CheesePizza implements Pizza{
    @Override
    public void describePizza() {
        System.out.println("Cheese pizza");
    }
}
