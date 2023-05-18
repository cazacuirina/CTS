package Restaurant.Adapter;

// 2. Clasa concreta originala / proprie (TARGET)
public class FacturaBucatarie implements IFactura{
    double pretTotal;
    String data;

    public FacturaBucatarie(double pretTotal, String data) {
        this.pretTotal = pretTotal;
        this.data = data;
    }

    @Override
    public String toString() {
        return "FacturaBucatarie{" +
                "pretTotal=" + pretTotal +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public void printFactura() {
        System.out.println(this.toString());
    }
}
