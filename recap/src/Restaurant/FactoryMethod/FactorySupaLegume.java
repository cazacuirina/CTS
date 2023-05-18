package Restaurant.FactoryMethod;

public class FactorySupaLegume implements FactorySupa{
    @Override
    public Supa createSupa() {
        return new SupaLegume();
    }
}

