package Prototype;

import java.util.ArrayList;
import java.util.List;

public class AnimalList implements IAnimalList{
    List<String> animals=new ArrayList<String>();

    public AnimalList() {}

    public void setAnimals(List<String> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "animals=" + animals +
                '}';
    }
    @Override
    public IAnimalList createAnimal() {
        AnimalList animalList=new AnimalList();
        List<String> auxList=new ArrayList<String>();
        for(String animal:animals){
            auxList.add(animal);
        }
        animalList.setAnimals(auxList);    //NU UITA SET
        return animalList;                 //UPCASTING
    }

    @Override
    public IAnimalList createShallowCopy() throws CloneNotSupportedException {
        return (AnimalList) super.clone();
    }

    @Override
    public void loadAnimalData() {
        animals.add("cat");
        animals.add("dog");
    }
}
