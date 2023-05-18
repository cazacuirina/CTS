package Restaurant.Decorator;

// 4. CONCRETE DECORATOR
public class NotaPlataLMAConcret extends AbstractNotaPlataLMA{
    public NotaPlataLMAConcret(INotaPlata iNotaPlata) {
        super(iNotaPlata);
    }

    @Override
    public void printeazaLMA() {
        iNotaPlata.printeazaNota();
        System.out.println("La multi ani!");
    }
}
