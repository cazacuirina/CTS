package SimpleFactoryPizza;

public class PepperoniPizza implements Pizza{

    @Override
    public void describePizza() {
        System.out.println("Pepperoni pizza");
    }
}
