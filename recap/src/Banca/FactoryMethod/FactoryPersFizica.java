package Banca.FactoryMethod;

public class FactoryPersFizica implements Factory{
    @Override
    public Client getClient() {
        return new PersoanaFizica();
    }
}
