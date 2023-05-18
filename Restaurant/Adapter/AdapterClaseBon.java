package Restaurant.Adapter;

// 4. Adapter clase (bar->bucatarie)
public class AdapterClaseBon extends FacturaBar implements IFactura{
    public AdapterClaseBon(double pret, int nrBon) {
        super(pret, nrBon);
    }
    @Override
    public void printFactura() {
        super.emiteBon();
    }
}
