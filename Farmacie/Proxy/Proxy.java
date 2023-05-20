package Farmacie.Proxy;

public class Proxy implements VerificareReteta{
    private Client client;

    public Proxy(Client client) {
        this.client = client;
    }
    @Override
    public void afiseazaReteta() {
        if(client.areReteta()){
            client.afiseazaReteta();
        }else{
            System.out.println("Clientul nu a prezentat reteta");
        }
    }
}
