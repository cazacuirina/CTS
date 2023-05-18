package Spital.Prototype;

public class RetetaPanadol implements Reteta{
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
        return (RetetaPanadol)super.clone();
    }

    @Override
    public String toString() {
        return "RetetaPanadol{" +
                "cantitate=" + cantitate +
                ", substanta='" + substanta + '\'' +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
