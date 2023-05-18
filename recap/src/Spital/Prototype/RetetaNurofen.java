package Spital.Prototype;

public class RetetaNurofen implements Reteta{
    int cantitate;
    String substanta;
    @Override
    public void setCantitate(int grame) {
        this.cantitate=grame;
    }

    @Override
    public void setSubstanta(String substanta) {
        this.substanta=substanta;
    }

    //METODA CLONARE

    @Override
    public Reteta clone() throws CloneNotSupportedException {
        return (RetetaNurofen)super.clone();
    }

    @Override
    public String toString() {
        return "RetetaParacetamol{" +
                "cantitate=" + cantitate +
                ", substanta='" + substanta + '\'' +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}