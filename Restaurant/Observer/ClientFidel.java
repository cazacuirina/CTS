package Restaurant.Observer;

public class ClientFidel implements IClient{
    String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String notificare) {
        System.out.println("Clientul "+nume+" a receptionat notificarea: "+notificare);
    }
}
