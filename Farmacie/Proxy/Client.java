package Farmacie.Proxy;

public class Client implements VerificareReteta{
    private String medicament;
    private  boolean areReteta;

    public Client(String medicament, boolean areReteta) {
        this.medicament = medicament;
        this.areReteta = areReteta;
    }

    public boolean areReteta() {
        return areReteta;
    }

    @Override
    public void afiseazaReteta() {
        System.out.println("S-a vandut "+medicament);
    }
}
