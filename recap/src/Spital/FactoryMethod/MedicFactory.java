package Spital.FactoryMethod;

public class MedicFactory implements Factory{
    @Override
    public Personal createPersonal() {
        return new Medic();
    }
}
