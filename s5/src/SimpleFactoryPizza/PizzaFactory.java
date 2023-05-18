package SimpleFactoryPizza;

public class PizzaFactory {

    //METODE STATICE PT A NU INSTANTIA CLASA SEPARAT
    public static Pizza createPizza(String type){
        if(type.equals("Cheese")){
            return new CheesePizza();
        }else if (type.equals("Pepperoni")){
            return new PepperoniPizza();
        }
        return null;
    }

    public static Pizza createPizzaEnum(PizzaType pizzaType) throws Exception {
        switch (pizzaType){
            case PepperoniPizza :{
                return new PepperoniPizza();
            }
            case CheesePizza:{
                return new CheesePizza();
            }
            case VeggiePizza:{
                return new VeggiePizza();
            }
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}
