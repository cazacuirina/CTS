package Spital.Observer;

// 2. Observer concret
public class PacientAbonat implements IPacient{
    String nume;

    public PacientAbonat(String nume) {
        this.nume = nume;
    }
    @Override
    public void receptioneazaNotificare(String notificare) {
        System.out.println(this.nume+" a receptionat notificarea: "+notificare);
    }
}
