package Restaurant.Observer;

import Restaurant.State.Libera;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Meniu implements IMeniu{

    List<IClient>clienti;

    public Meniu() {
        this.clienti = new ArrayList<>();
    }

    @Override
    public void aboneazaClient(IClient client) {
        this.clienti.add(client);
    }

    @Override
    public void dezaboneazaClient(IClient client) {
        this.clienti.remove(client);
    }

    @Override
    public void notificaClient(String notificare) {
        for(IClient c:clienti){
            c.receptioneazaNotificare(notificare);
        }
    }

    public void reducerePret(int proc){
        notificaClient("Reducere pret de: "+proc+"%");
    }

    public void itemNou(String mancare){
        notificaClient("Produs nou: "+mancare);
    }

}
