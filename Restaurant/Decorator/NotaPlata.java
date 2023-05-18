package Restaurant.Decorator;

// 2. Concrete Product
public class NotaPlata implements INotaPlata{
    double pretTotal;

    public NotaPlata(double pretTotal) {
        this.pretTotal = pretTotal;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota: "+pretTotal+" lei");
    }
}
