package FacadeMasini;

public class MasinaElectrica implements Automobil{
    String denumire;
    int durataBaterie;

    public MasinaElectrica() {
        this.denumire = "masina electrica";
        this.durataBaterie = 30;
    }

    @Override
    public String toString() {
        return "MasinaElectrica{" +
                "denumire='" + denumire + '\'' +
                ", durataBaterie=" + durataBaterie +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
