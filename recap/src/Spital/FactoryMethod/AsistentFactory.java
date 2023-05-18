package Spital.FactoryMethod;

public class AsistentFactory implements Factory{
    @Override
    public Personal createPersonal() {
        return new Asistent();
    }
}
