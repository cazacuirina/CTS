package Prototype;

public interface IAnimalList {
    IAnimalList createAnimal();
    IAnimalList createShallowCopy() throws CloneNotSupportedException;
    void loadAnimalData();
}
