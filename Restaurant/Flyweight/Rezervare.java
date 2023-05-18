package Restaurant.Flyweight;

// 4. Clasa atribute extra/unice/EXTRINSECA
public class Rezervare {
    int nrMasa;
    int nrPers;
    int ora;

    public Rezervare(int nrMasa, int nrPers, int ora) {
        this.nrMasa = nrMasa;
        this.nrPers = nrPers;
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrMasa=" + nrMasa +
                ", nrPers=" + nrPers +
                ", ora=" + ora +
                '}';
    }
    public void afiseazaRezervare(){
        System.out.println(this.toString());
    }

}
