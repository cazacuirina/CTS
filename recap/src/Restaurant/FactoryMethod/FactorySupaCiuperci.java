package Restaurant.FactoryMethod;

public class FactorySupaCiuperci implements FactorySupa{
    @Override
    public Supa createSupa() {
        return new SupaCiuperci();
    }
}
