package Spital.Flyweight;

// 2. clasa comuna / repetata
public class Pacient implements IPacient{
    String nume;
    String nrTelefon;
    String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void descrieInternare(Salon salon) {
        System.out.println("Internare: "+this.toString()+ " "+salon.toString());
    }

}
