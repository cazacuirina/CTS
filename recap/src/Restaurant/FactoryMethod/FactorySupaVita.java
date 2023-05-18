package Restaurant.FactoryMethod;

public class FactorySupaVita implements FactorySupa{
    @Override
    public Supa createSupa() {
        return new SupaVita();
    }
}
