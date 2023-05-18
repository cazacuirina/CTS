package Spital.Proxy;

// 1. clasa dupa care se face verificarea
public class Pacient {
    String nume;
    boolean asigurareMedicala;

    public Pacient(String nume, boolean asigurareMedicala) {
        this.nume = nume;
        this.asigurareMedicala = asigurareMedicala;
    }

    public boolean areAsigurareMedicala() {
        return asigurareMedicala;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", asigurareMedicala=" + asigurareMedicala +
                '}';
    }

    public void descriePacient(){
        System.out.println(this.toString());
    }
}
