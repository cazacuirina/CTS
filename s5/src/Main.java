import AbstractFactoryGUI.GuiFactory;
import AbstractFactoryGUI.MacGuiFactory;
import AbstractFactoryGUI.WindowsGuiFactory;
import FactoryMethodAnimal.*;
import FactoryMethodVehicle.*;
import SimpleFactoryPizza.Pizza;
import SimpleFactoryPizza.PizzaFactory;
import SimpleFactoryPizza.PizzaType;
import SimpleFactoryShape.Shape;
import SimpleFactoryShape.ShapeFactory;
import SimpleFactoryShape.ShapeType;

public class Main {
    public static void main(String[] args) throws Exception {
        //  SIMPLE FACTORY
        System.out.println("SIMPLE FACTORY");
        //String
        Pizza cheesePizza= PizzaFactory.createPizza("Cheese");
        cheesePizza.describePizza();

        Pizza pepperoniPizza=PizzaFactory.createPizza("Pepperoni");
        pepperoniPizza.describePizza();

        //Enum
        Pizza cheesePizza2=PizzaFactory.createPizzaEnum(PizzaType.CheesePizza);
        cheesePizza2.describePizza();

        Pizza pepperoniPizza2=PizzaFactory.createPizzaEnum(PizzaType.PepperoniPizza);
        pepperoniPizza2.describePizza();

        //adaugare - NECESITA REFACTORING (modificare ENUM si SWITCH/IF)
        Pizza veggiePizza=PizzaFactory.createPizzaEnum(PizzaType.VeggiePizza);
        veggiePizza.describePizza();

        //FACTORY METHOD
        System.out.println("FACTORY METHOD");

        AnimalFactory catFactory=new CatFactory();
        Animal cat=catFactory.createAnimal();
        cat.makeSound();

        AnimalFactory dogFactory=new DogFactory();
        Animal dog=dogFactory.createAnimal();
        dog.makeSound();

        //adaugare - NU necesita refactoring, se respecta open close principle (extindere clase)
        AnimalFactory duckFactory=new DuckFactory();
        Animal duck=duckFactory.createAnimal();
        duck.makeSound();

        //  ----SUBIECT----
        //NU esti constrans sa folosesti simple/method decat daca specifica CLAR in enunt ca aplicatia suporta modificari constant
        //  DIAGRAME CLASE
        //  FA RESTUL PROBLEMELOR DIN WORD SI PDF

        //  ABSTRACT FACTORY - pentru mai multe obiecte grupate
        System.out.println("ABSTRACT FACTORY");
        GuiFactory macGuiFactory=new MacGuiFactory();
        macGuiFactory.getButton().createButton();
        macGuiFactory.getMenu().createMenu();

        GuiFactory windowsGuiFactory=new WindowsGuiFactory();
        windowsGuiFactory.getButton().createButton();
        windowsGuiFactory.getMenu().createMenu();




        //SIMPLE FACTORY - cu abstract class
        System.out.println("SIMPLE FACTORY");
        ShapeFactory shapeFactory= new  ShapeFactory();
        Shape rectangle=shapeFactory.createShape(ShapeType.Rectangle);
        rectangle.getNoSides();
        Shape circle=shapeFactory.createShape(ShapeType.Circle);
        circle.getNoSides();

        //FACTORY METHOD - cu abstract class
        System.out.println("FACTORY METHOD");
        VehicleFactory carFactory=new CarFactory();
        Vehicle car=carFactory.createVehicle();
        car.ride();
        VehicleFactory bikeFactory=new BikeFactory();
        Vehicle bike=bikeFactory.createVehicle();
        bike.ride();

        //ABSTRACT FACTORY


    }
}