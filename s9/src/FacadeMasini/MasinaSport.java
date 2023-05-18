package FacadeMasini;

public class MasinaSport implements Automobil{
    String denumire;
    int vitezaMax;

    public MasinaSport() {
        this.denumire = "masina sport";
        this.vitezaMax = 300;
    }

    @Override
    public String toString() {
        return "MasinaSport{" +
                "denumire='" + denumire + '\'' +
                ", vitezaMax=" + vitezaMax +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
