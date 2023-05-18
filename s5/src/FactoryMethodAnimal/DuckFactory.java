package FactoryMethodAnimal;

public class DuckFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Duck();
    }
}
