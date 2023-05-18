package Restaurant.Adapter;

// 4. Adapter obiect (bar->bucatarie)
public class AdapterObiectBon implements IFactura{
    FacturaBar facturaBar;

    public AdapterObiectBon(FacturaBar facturaBar) {
        this.facturaBar = facturaBar;
    }

    @Override
    public void printFactura() {
        facturaBar.emiteBon();
    }
}
