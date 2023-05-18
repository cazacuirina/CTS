package Restaurant.Proxy;

// 2. Clasa basic (nerestrictionata)
public class Rezervare implements IRezervare{
    int nrPers;
    int nrMasa;
    public Rezervare(int nrPers, int nrMasa) {
        this.nrPers = nrPers;
        this.nrMasa = nrMasa;
    }

    public int getNrPers() {
        return nrPers;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrPers=" + nrPers +
                ", nrMasa=" + nrMasa +
                '}';
    }

    @Override
    public void afiseazaRezervare() {
        System.out.println(this.toString());
    }
}
