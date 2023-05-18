package Spital.Proxy;

// 3. clasa gestionata
public class Internare implements  IInternare{
    int nrSalon;
    Pacient pacient;

    public Internare(int nrSalon, Pacient pacient) {
        this.nrSalon = nrSalon;
        this.pacient = pacient;
    }

    public Pacient getPacient() {
        return pacient;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "nrSalon=" + nrSalon +
                ", pacient=" + pacient +
                '}';
    }

    @Override
    public void interneazaPacient() {
        System.out.println(this.toString());
    }
}
