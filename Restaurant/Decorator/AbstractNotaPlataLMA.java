package Restaurant.Decorator;

// 3. ABSTRACT DECORATOR
public abstract class AbstractNotaPlataLMA implements INotaPlata{
    protected INotaPlata iNotaPlata; // PROTECTED PT DERIVARE CONCRET

    public AbstractNotaPlataLMA(INotaPlata iNotaPlata) {
        this.iNotaPlata = iNotaPlata;
    }

    @Override
    public void printeazaNota() {
        this.iNotaPlata.printeazaNota();
    }

    public abstract void printeazaLMA();

}
