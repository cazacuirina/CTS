package Restaurant.Adapter;

// 3. Clasa achizitionata (ADAPTEE)
public class FacturaBar {
    double pret;
    int nrBon;

    public FacturaBar(double pret, int nrBon) {
        this.pret = pret;
        this.nrBon = nrBon;
    }

    @Override
    public String toString() {
        return "FacturaBar{" +
                "pret=" + pret +
                ", nrBon=" + nrBon +
                '}';
    }
    public void emiteBon(){
        System.out.println(this.toString());
    }
}
