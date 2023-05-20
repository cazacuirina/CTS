package Farmacie;

import Farmacie.Adapter.Adapter;
import Farmacie.Adapter.Gestiune;
import Farmacie.Adapter.GestiuneStoc;
import Farmacie.Adapter.VanzareMedicament;
import Farmacie.Composite.Component;
import Farmacie.Composite.Item;
import Farmacie.Composite.Sectiune;
import Farmacie.Decorator.Bon;
import Farmacie.Decorator.FelicitareDecorator;
import Farmacie.Decorator.IBon;
import Farmacie.Facade.Facade;
import Farmacie.Facade.Pacient;
import Farmacie.Flyweight.RegistruClienti;
import Farmacie.Flyweight.Reteta;
import Farmacie.Memento.ManagerStocuri;
import Farmacie.Memento.MementoStoc;
import Farmacie.Memento.Stoc;
import Farmacie.Observer.Discount;
import Farmacie.Observer.IClient;
import Farmacie.Observer.IDiscount;
import Farmacie.Proxy.Client;
import Farmacie.Proxy.Proxy;
import Farmacie.Strategy.Cutie;
import Farmacie.Strategy.Farmacist;
import Farmacie.Strategy.Folie;
import Restaurant.Memento.MeniuManager;
import Restaurant.Memento.Produs;
import Restaurant.Observer.ClientFidel;
import Restaurant.Observer.Meniu;
import Restaurant.State.Masa;
import Restaurant.State.Rezervata;
import Restaurant.Strategy.OperatorRezervari;
import Restaurant.Strategy.RezervareInterior;
import Restaurant.Strategy.RezervareTerasa;

public class Main {
    public static void main(String[] args) {

        //------------------------STRUCTURAL---------------------
        System.out.println("\t\t\tSTRUCTURAL");

        // ADAPTER
        System.out.println("ADAPTER");

        Gestiune gestiune=new GestiuneStoc();
        gestiune.verificaStoc(102, 2);

        VanzareMedicament vanzareMedicament=new VanzareMedicament();
        Adapter adapter=new Adapter(vanzareMedicament);
        adapter.verificaStoc(101, 5);
        adapter.verificaStoc(101, 7);

        // FACADE
        System.out.println("\nFACADE");

        Facade facade=new Facade();
        facade.vindeMedicamente(true);

        // DECORATOR
        System.out.println("\nDECORATOR");

        IBon bon=new Bon();
        bon.printBon();

        FelicitareDecorator felicitare=new FelicitareDecorator(bon);
        felicitare.printFelicitare();

        // COMPOSITE
        System.out.println("\nCOMPOSITE");

        Sectiune raceala=new Sectiune("raceala");
        Sectiune antibiotice=new Sectiune("antibiotice");
        Sectiune adulti=new Sectiune("adulti");
        Sectiune copii=new Sectiune("copii");
        raceala.adaugaSectiune(adulti);
        raceala.adaugaSectiune(copii);
        adulti.adaugaSectiune(new Item("Nurofen forte"));
        copii.adaugaSectiune(new Item("Panadol"));
        antibiotice.adaugaSectiune(new Item("Omeprazol"));
        raceala.afiseazaComponenta();
        antibiotice.afiseazaComponenta();

        // PROXY
        System.out.println("\nPROXY");

        Client client1=new Client("Forlax", false);
        Client client2=new Client("Solpadeine", true);
        Proxy proxy=new Proxy(client1);
        proxy.afiseazaReteta();
        proxy=new Proxy(client2);
        proxy.afiseazaReteta();

        // FLYWEIGHT
        System.out.println("\nFLYWEIGHT");

        Reteta reteta1=new Reteta(2, 120);
        Reteta reteta2=new Reteta(1, 55);
        Reteta reteta3=new Reteta(4, 350);

        RegistruClienti registruClienti=new RegistruClienti();

        Farmacie.Flyweight.IClient client3 = registruClienti.inregistreazaClient("RX101", "Mihai", 4571);
        client3.afiseazaAchizitie(reteta1);

        Farmacie.Flyweight.IClient client4 = registruClienti.inregistreazaClient("RX102", "Sandra", 6729);
        client4.afiseazaAchizitie(reteta2);

        Farmacie.Flyweight.IClient client5 = registruClienti.inregistreazaClient("RX101", "Mihai", 4571);
        client5.afiseazaAchizitie(reteta3);

        //--------------------------------BEHAVIOURAL------------------
        System.out.println("\n\t\t\tBEHAVIOURAL");

        // STRATEGY
        System.out.println("\nSTRATEGY");
        Cutie cutie=new Cutie();
        Folie folie=new Folie();

        Farmacist farmacist=new Farmacist(cutie);
        farmacist.vindeMedicament();

        farmacist=new Farmacist(folie);
        farmacist.vindeMedicament();

        // OBSERVER
        System.out.println("\nOBSERVER");

        IClient clientAbonat1=new Farmacie.Observer.Client("Traian");
        IClient clientAbonat2=new Farmacie.Observer.Client("Dana");

        Discount discount=new Discount(20);
        discount.adaugaClient(clientAbonat1);
        discount.adaugaClient(clientAbonat2);

        discount.emiteOfertaPret();

        // STATE
        System.out.println("\nSTATE");

        Farmacie.State.Reteta reteta=new Farmacie.State.Reteta(1029, 150);
        reteta.solicitaReteta();
        reteta.achizitioneazaMedicamente();

        // MEMENTO
        System.out.println("\nMEMENTO");

        ManagerStocuri managerStocuri=new ManagerStocuri();

        Stoc stoc=new Stoc(25, "Farmadex");
        stoc.afiseazaStoc();

        managerStocuri.adaugaMemento("aprilie",stoc.salveazaStoc());

        stoc.setNrMedicamente(35);
        stoc.afiseazaStoc();

        stoc.restaureazaStoc(managerStocuri.reseteazaMemento("aprilie"));
        stoc.afiseazaStoc();

    }
}