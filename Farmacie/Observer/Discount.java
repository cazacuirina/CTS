package Farmacie.Observer;

import java.util.ArrayList;
import java.util.List;

public class Discount implements IDiscount{
    int procent;
    List<IClient >clientiAbonati;

    public Discount(int procent) {
        this.procent = procent;
        this.clientiAbonati = new ArrayList<>();
    }

    @Override
    public void adaugaClient(IClient client) {
        this.clientiAbonati.add(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IClient c:clientiAbonati){
            c.receptioneazaNotificare(mesaj);
        }
    }

    public void emiteOfertaPret(){
        trimiteNotificare("Discount de "+this.procent+"% la medicamente pentru bebelusi");
    }
}
