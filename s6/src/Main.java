import BuilderV1.Pizza;
import BuilderV1.PizzaBuilder;
import Prototype.AnimalList;
import Prototype.IAnimalList;

public class Main {
    public static void main(String[] args) {
        //   PROTOTYPE
        //Interfata: metoda void loadData + ILista createList
        //Clasa: setter lista, citire date loadData, copiere deep element cu element in Lista
        System.out.println("PROTOTYPE");
        IAnimalList iAnimalList=new AnimalList();   //instantiere lista
        iAnimalList.loadAnimalData();               //incarca toate datele
        iAnimalList.createAnimal();                 //copiaza in lista noua

//        try {
//            iAnimalList.createShallowCopy();
//        }catch (CloneNotSupportedException ex){
//            ex.printStackTrace();
//        }

        System.out.println(iAnimalList.toString());

        //   BUILDER
        //      V1
        //Interfata: anunta build
        //PizzaaBuilder: atribut de tip Pizza, constructor cu atr default, setter PizzaBuilder pt fiecare atribut Pizza, build return Pizza
        System.out.println("BUILDER V1");
        //1-apel constructor cu false/zero/init     2-setare atrib      3-returnare obiect setat
        Pizza pizza=new PizzaBuilder().setHasPepperoni(true).setHasCheese(false).setPrice(15).createPizza();
        System.out.println(pizza.toString());

        //      V2
        //PizzaBuilder: atribute identice cu ale Pizza, constructor cu atr default, setter PizzaBuilder pt fiecare atr, build return Pizza(toti param)
        System.out.println("BUILDER V2");
        Pizza pizzaV2=new PizzaBuilder().setHasPepperoni(false).setHasCheese(true).setPrice(10).createPizza();
        System.out.println(pizzaV2.toString());

        //      V3
        //Pizza: constructor cu parametrul PizzaBUILDER din care extrag fiecare atrib pizza + metoda getBuilder care returneaza nu nou PizzaBuilder
        //PizzaBuilder(static inner class): atr ca in Pizza, setteri ca la V1&2, Build return new Pizza(this)
        System.out.println("BUILDER V3");
        BuilderV3.Pizza pizzaV3= BuilderV3.Pizza.getBuilder().setHasPepperoni(true).setHasCheese(true).setPrice(20).build();
        System.out.println(pizzaV3.toString());

    }
}