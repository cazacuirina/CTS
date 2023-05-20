package Restaurant.Observer;

public interface IMeniu {
    void aboneazaClient(IClient client);
    void dezaboneazaClient(IClient client);

    void notificaClient(String notificare);
}
