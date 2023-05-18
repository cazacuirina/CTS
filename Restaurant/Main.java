package Restaurant;

import Restaurant.Adapter.*;
import Restaurant.Composite.ItemMeniu;
import Restaurant.Composite.SectiuneMeniu;
import Restaurant.Decorator.INotaPlata;
import Restaurant.Decorator.NotaPlata;
import Restaurant.Decorator.NotaPlataLMAConcret;
import Restaurant.Facade.FacadeMasa;
import Restaurant.Flyweight.Client;
import Restaurant.Flyweight.FabricaClienti;
import Restaurant.Flyweight.Rezervare;
import Restaurant.Proxy.RezervareProxy;
import Spital.Adapter.*;
import Spital.Composite.Departament;
import Spital.Composite.DiviziuneSpital;
import Spital.Composite.Sectie;
import Spital.Decorator.FisaRezultate;
import Spital.Decorator.IRezultat;
import Spital.Decorator.PlatformaRezultate;
import Spital.Decorator.Rezultat;
import Spital.Facade.Internare;
import Spital.Flyweight.FabricaPacienti;
import Spital.Flyweight.IPacient;
import Spital.Flyweight.Salon;
import Spital.Proxy.Pacient;
import Spital.Proxy.ProxyInternare;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //ADAPTER
        //SINTAGME: achizitie soft nou/cu clase diferite, conlucrare frameworks fara a modifica cod
        //interfata originala, clasa originala ce implementeaza interfata
        //clasa nou achizitionata, clasa adaptor ce implementeaza interfata si extinde clasa noua (V1)/contine obiect de tip nou (V2)
        //client ce se foloseste de interfata pt a manipula obiecte de ambele tipuri
        System.out.println("ADAPTER");

        FacturaBucatarie facturaBucatarie = new FacturaBucatarie(200.5, "10/10/2001");
        facturaBucatarie.printFactura();

        FacturaBar facturaBar=new FacturaBar(75.5, 103);

        IFactura facturaBucatarieAdaptata1 = new AdapterClaseBon(75.5, 103);
        facturaBucatarieAdaptata1.printFactura();

        IFactura facturaBucatarieAdaptata2 = new AdapterObiectBon(facturaBar);
        facturaBucatarieAdaptata2.printFactura();

        //FACADE
        //SINTAGME: framework complex, simplifica munca operatorului, verifica intr-un singur loc
        //clasele ce alcatuiesc frameworkul, fiecare cu responsabilitatea sa
        //clasa facade care opereaza cu metodele claselor din framework intr-o singura metoda
        System.out.println("\nFACADE");

        FacadeMasa facadeMasa=new FacadeMasa(8);
        facadeMasa.alocaMasa(true, true, false);
        facadeMasa.alocaMasa(true, true, true);

        //DECORATOR
        //SINTAGME: noi functionalitati/caracteristici la runtime, revine la situatia initiala fara a modifica codul
        //interfata si clasa originala care o implementeaza (product)
        //decoratorul abstract ce implementeaza interfata si contine o instanta a interfetei + metoda extra Abstracta
        //decoratorul concret ce il extinde pe cel abstract
        System.out.println("\nDECORATOR");

        INotaPlata iNotaPlata=new NotaPlata(545.99);
        iNotaPlata.printeazaNota();

        iNotaPlata=new NotaPlataLMAConcret(iNotaPlata);
        ((NotaPlataLMAConcret) iNotaPlata ).printeazaLMA();

        //COMPOSITE
        //SINTAGME: structura arborescenta/ierarhica, subdepartamente, optiuni meniu
        //interfata diviziune/nod cu metode de adaugare/modificare/stergere care arunca exceptii
        //nod compus cu implementare metode pe lista de subdiviziuni
        //nod frunza care doar arunca exceptii, neavand lista
        //   SAU METODE ADAUGARE/STERGERE DOAR IN NOD COMPOSITE SI DOAR METODA AFISARE IN INTERFATA
        System.out.println("\nCOMPOSITE");

        ItemMeniu apa=new ItemMeniu("apa");
        ItemMeniu bere=new ItemMeniu("bere");
        ItemMeniu suc=new ItemMeniu("suc");
        ItemMeniu vin=new ItemMeniu("vin");
        ItemMeniu friptura=new ItemMeniu("friptura");

        SectiuneMeniu mancare=new SectiuneMeniu("mancare");
        SectiuneMeniu bauturi=new SectiuneMeniu("bauturi");

        SectiuneMeniu alcoolic=new SectiuneMeniu("alcoolic");
        SectiuneMeniu nonalcoolic=new SectiuneMeniu("nonalcoolic");


        alcoolic.adaugaComponenta(vin);
        nonalcoolic.adaugaComponenta(apa);
        alcoolic.adaugaComponenta(bere);
        nonalcoolic.adaugaComponenta(suc);

        bauturi.adaugaComponenta(alcoolic);
        bauturi.adaugaComponenta(nonalcoolic);
        mancare.adaugaComponenta(friptura);

        bauturi.afiseazaItem();
        mancare.afiseazaItem();

        bauturi.eliminaComponenta(alcoolic);
        nonalcoolic.schimbaComponente(apa, suc);
        bauturi.afiseazaItem();

        //FLYWEIGHT
        //SINTAGME:
        //interfata cu metoda afisare cu param obiect UNIC si clasa basic (repetitive)
        //clasa cu optiunile extra (unice)
        //fabrica cu registrul (hashmap) care recupereaza sau creeaza o inregistrare
        System.out.println("\nFLYWEIGHT");

        Rezervare r1=new Rezervare(10,4,18);
        Rezervare r2=new Rezervare(12,2,16);
        Rezervare r3=new Rezervare(17,4,20);

        FabricaClienti fabricaClienti= new FabricaClienti();
        Client clientAna=fabricaClienti.gasesteClient("Ana", "703345432", "anutza@yahoo.com");
        Client clientMaria=fabricaClienti.gasesteClient("Maria", "70359284", "maria@gmail.com");

        clientAna.adaugaRezervare(r1);
        clientMaria.adaugaRezervare(r2);
        clientAna.adaugaRezervare(r3);

        clientAna.afiseazaClient();
        clientMaria.afiseazaClient();


        //PROXY
        //SINTAGME: nivel intermediar pt verificare conditii, control acces / permisiuni
        //optional: clasa care da conditia
        //interfata clasei gestionate si clasa gestionata (cu obiect de tipul cls cond)
        //proxy cu obiect de tip cls gestionata si metoda de verificare cond
        System.out.println("\nPROXY");

        Restaurant.Proxy.Rezervare rezervare1=new Restaurant.Proxy.Rezervare(2, 10);
        Restaurant.Proxy.Rezervare rezervare2=new Restaurant.Proxy.Rezervare(5, 13);

        RezervareProxy rezervareProxy=new RezervareProxy(rezervare1);
        rezervareProxy.afiseazaRezervare();
        rezervareProxy=new RezervareProxy(rezervare2);
        rezervareProxy.afiseazaRezervare();

    }
}