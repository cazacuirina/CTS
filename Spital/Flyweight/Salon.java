package Spital.Flyweight;

// 3. clasa unica
public class Salon {
    int nrSalon;
    int nrPat;
    int nrSpitalizare;

    public Salon(int nrSalon, int nrPat, int nrSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrSpitalizare = nrSpitalizare;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "nrSalon=" + nrSalon +
                ", nrPat=" + nrPat +
                ", nrSpitalizare=" + nrSpitalizare +
                '}';
    }
}
