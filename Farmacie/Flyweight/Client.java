package Farmacie.Flyweight;

public class Client implements IClient{
    private String nume;
    private int nrAsigurare;

    public Client(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrAsigurare=" + nrAsigurare +
                '}';
    }
    @Override
    public void afiseazaAchizitie(Reteta reteta) {
        System.out.println(this.toString() + reteta.toString());
    }
}
