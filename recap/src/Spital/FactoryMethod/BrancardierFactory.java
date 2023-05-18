package Spital.FactoryMethod;

public class BrancardierFactory implements Factory{
    @Override
    public Personal createPersonal() {
        return new Brancardier();
    }
}
