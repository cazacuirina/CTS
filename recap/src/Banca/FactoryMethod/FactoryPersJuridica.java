package Banca.FactoryMethod;

public class FactoryPersJuridica implements Factory{
    @Override
    public Client getClient() {
        return new PersoanaJuridica();
    }
}