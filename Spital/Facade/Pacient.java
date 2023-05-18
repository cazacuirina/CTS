package Spital.Facade;

// 1. Framework class
public class Pacient {
    String nume;
    boolean stareGrava;
    String diagnostic;

    public Pacient(String nume, boolean stareGrava, String diagnostic) {
        this.nume = nume;
        this.stareGrava = stareGrava;
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", stareGrava=" + stareGrava +
                ", diagnostic='" + diagnostic + '\'' +
                '}';
    }

    public boolean verificaStare() {
        return stareGrava;
    }
}
