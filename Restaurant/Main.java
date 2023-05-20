package Restaurant;

import Restaurant.Memento.MeniuManager;
import Restaurant.Memento.Produs;
import Restaurant.Observer.ClientFidel;
import Restaurant.Observer.IMeniu;
import Restaurant.Observer.Meniu;
import Restaurant.State.Masa;
import Restaurant.Strategy.OperatorRezervari;
import Restaurant.Strategy.Rezervare;
import Restaurant.Strategy.RezervareInterior;
import Restaurant.Strategy.RezervareTerasa;

public class Main {
    public static void main(String[] args) {
        // STRATEGY
        // alegere strategie la runtime
        // interfata cu metoda generica + clasele cu strategiile specifice
        // manager cu instanta de tip interfata, setter si metoda cu apel strategie specifica
        System.out.println("STRATEGY");

        OperatorRezervari operatorRezervari=new OperatorRezervari();

        operatorRezervari.alegeZona(new RezervareInterior());
        operatorRezervari.confirmaRezervare();

        operatorRezervari.alegeZona(new RezervareTerasa());
        operatorRezervari.confirmaRezervare();

        // STATE
        // schimba comportament in functie de starile obiectului
        // interfata stare cu metoda schimbaStare(ctx) + cls stari concrete cu afisare si setStare(this)
        // cls care trece prin stari cu get pe atrib basic, instanta de stareAbstracta cu set&get,
        // constructor care pune starea initiala, metode care creeaza stari noi si schimba stare obiect crt
        System.out.println("\nSTATE");

        Masa masa=new Masa(18);
        masa.ocupaMasa();
        masa.elibereazaMasa();

        // OBSERVER
        // emite notificari catre persoanele abonate, anunta schimbarea starii unor obiecte
        // interfata + clsConcreta observer cu receptionare (mesaj) si atrib basic
        // interfata subject cu adauga, sterge si notifica observeri
        // + cls concreta subject cu lista observeri si diverse tipuri de notificari
        System.out.println("\nOBSERVER");

        ClientFidel client1=new ClientFidel("Diana");
        ClientFidel client2=new ClientFidel("Adi");

        Meniu meniu=new Meniu();
        meniu.aboneazaClient(client1);
        meniu.aboneazaClient(client2);

        meniu.itemNou("Foie gras cu reductie de zmeura");
        meniu.reducerePret(25);

        // MEMENTO
        // salveaza si revine la stari anterioare, pentru atribute care se modifica des
        // clasa care trebuie salvata, cu setter pe atributele care se modifica des + save&restore pe acele atribute cu memento
        // memento cu atrib care trb salvate, constructor cu param (VEZI ALOCARE MEMORIE) si getter
        // manager memento cu hashmap/list - cu add&getMemento
        System.out.println("\nMEMENTO");

        MeniuManager meniuManager=new MeniuManager();

        Produs produs1=new Produs("Limonada", 15.5);
        meniuManager.adaugaMemento(produs1.salveazaProdus(), "5/03/2023");
        produs1.afiseazaProdus();
        Produs produs2=new Produs("Limonada cu zmeura", 19);
        produs2.afiseazaProdus();
        produs2.restaureazaProdus(meniuManager.getMemento("5/03/2023"));
        produs2.afiseazaProdus();
    }
}