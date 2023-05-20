package Farmacie.Flyweight;

public class Reteta {
    private int nrMedicamente;
    private double pret;

    public Reteta(int nrMedicamente, double pret) {
        this.nrMedicamente = nrMedicamente;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nrMedicamente=" + nrMedicamente +
                ", pret=" + pret +
                '}';
    }
}
