package Farmacie.Observer;

public class Client implements IClient{
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println(this.nume+" a receptionat notificarea: "+mesaj);
    }
}
