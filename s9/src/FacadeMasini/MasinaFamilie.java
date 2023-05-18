package FacadeMasini;

public class MasinaFamilie implements Automobil{
    String denumire;
    int nrLocuri;

    public MasinaFamilie() {
        this.denumire = "masina familie";
        this.nrLocuri = 5;
    }

    @Override
    public String toString() {
        return "MasinaFamilie{" +
                "denumire='" + denumire + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
