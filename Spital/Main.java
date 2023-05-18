package Spital;

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

        MedicamentSpital medicamentSpital=new MedicamentSpital( 200, "Xanax", "Dr. Stancu");

        MedicamentFarmacieOriginal medicamentFarmacieOriginal=new MedicamentFarmacieOriginal(150, "Gabaran", "anxiolitic");
        MedicamentFarmacieAdaptatObiect medicamentFarmacieAdaptatObiect=new MedicamentFarmacieAdaptatObiect(medicamentFarmacieOriginal);

        MedicamentFarmacieAdaptatClasa medicamentFarmacieAdaptatClasa=new MedicamentFarmacieAdaptatClasa(175, "Sertralina", "antidepresiv");

        RetetaEmisa retetaEmisaSpital=new RetetaEmisa(medicamentSpital);
        retetaEmisaSpital.emiteReteta();

        RetetaEmisa retetaEmisaFarmacie1=new RetetaEmisa(medicamentFarmacieAdaptatObiect);
        retetaEmisaFarmacie1.emiteReteta();

        RetetaEmisa retetaEmisaFarmacie2=new RetetaEmisa(medicamentFarmacieAdaptatClasa);
        retetaEmisaFarmacie2.emiteReteta();

        //FACADE
        //SINTAGME: framework complex, simplifica munca operatorului, verifica intr-un singur loc
        //clasele ce alcatuiesc frameworkul, fiecare cu responsabilitatea sa
        //clasa facade care opereaza cu metodele claselor din framework intr-o singura metoda
        System.out.println("\nFACADE");

        Internare internare=new Internare();
        internare.realizeazaInternare("Maria", false, "raceala", "Dr. Macovei", "pediatrie");
        internare.realizeazaInternare("Ion", true, "pneumonie", "Dr. Istrate", "pneumologie");
        internare.realizeazaInternare("Alex", true, "covid", "Dr. Popa", "boli infectioase");

        //DECORATOR
        //SINTAGME: noi functionalitati/caracteristici la runtime, revine la situatia initiala fara a modifica codul
        //interfata si clasa originala care o implementeaza
        //decoratorul abstract ce implementeaza interfata si contine o instanta a interfetei + metoda extra
        //decoratorul concret ce il extinde pe cel abstract
        System.out.println("\nDECORATOR");

        IRezultat rezultat=new Rezultat("diabet", new HashMap<String, Integer>()
            {{put("glicemie", 150); put("tensiune", 120); }}    );
        rezultat.printeazaRezultat();

        FisaRezultate fisaRezultate=new PlatformaRezultate(rezultat);
        fisaRezultate.printeazaRezultat();
        fisaRezultate.afiseazaPePlatforma();

        //COMPOSITE
        //SINTAGME: structura arborescenta/ierarhica, subdepartamente, optiuni meniu
        //interfata diviziune/nod cu metode de adaugare/modificare/stergere care arunca exceptii
        //nod compus cu implementare metode pe lista de subdiviziuni
        //nod frunza care doar arunca exceptii, neavand lista
        System.out.println("\nCOMPOSITE");

        DiviziuneSpital departamentCardio=new Departament("Cardiologie");
        DiviziuneSpital departamentSportiv=new Departament("Medicina Sportiva");
        DiviziuneSpital departamentOrtopedie=new Departament("Ortopedie");
        DiviziuneSpital departamentPediatrie=new Departament("Pediatrie");

        DiviziuneSpital sectieBoliCardioVasculare=new Sectie("Boli cardiovasculare");
        DiviziuneSpital sectieORL=new Sectie("ORL");
        DiviziuneSpital sectieNeoNatala=new Sectie("Neo Natala");

        try{
            departamentCardio.adauga(sectieBoliCardioVasculare);
            departamentSportiv.adauga(departamentOrtopedie);
            departamentPediatrie.adauga(sectieNeoNatala);
            departamentPediatrie.adauga(sectieORL);
            departamentCardio.descrie();
            departamentSportiv.descrie();
            departamentOrtopedie.descrie();
            departamentPediatrie.descrie();

            departamentPediatrie.sterge(sectieORL);
            departamentPediatrie.modifica(0, new Sectie("Terapie Intensiva"));
            departamentPediatrie.descrie();

        }catch (Exception e){
            e.printStackTrace();
        }

        //FLYWEIGHT
        //SINTAGME:
        //interfata cu metoda afisare cu param obiect UNIC si clasa basic (repetitive)
        //clasa cu optiunile extra (unice)
        //fabrica cu registrul (hashmap) care recupereaza sau creeaza o inregistrare
        System.out.println("\nFLYWEIGHT");

        FabricaPacienti fabricaPacienti=new FabricaPacienti();

        Salon salon1=new Salon(101, 2, 65);
        Salon salon2=new Salon(104, 4, 75);

        IPacient pacient1=fabricaPacienti.getPacient(1, "Irina", "071887262", "Acasa");
        IPacient pacient2=fabricaPacienti.getPacient(2, "Claudia", "07999173", "La mare");

        pacient1.descrieInternare(salon1);
        pacient1.descrieInternare(salon2);
        pacient2.descrieInternare(salon2);

        //PROXY
        //SINTAGME: nivel intermediar pt verificare conditii, control acces / permisiuni
        //optional: clasa care da conditia
        //interfata clasei gestionate si clasa gestionata (cu obiect de tipul cls cond)
        //proxy cu obiect de tip cls gestionata si metoda de verificare cond
        System.out.println("\nPROXY");

        Pacient pacientAsigurat=new Pacient("Darius", true);
        Pacient pacientNeasigurat=new Pacient("Sanda", false);

        Spital.Proxy.Internare internarePosibila=new Spital.Proxy.Internare(34, pacientAsigurat);
        Spital.Proxy.Internare internareNepermisa=new Spital.Proxy.Internare(39, pacientNeasigurat);

        ProxyInternare proxyInternare1=new ProxyInternare((Spital.Proxy.Internare) internarePosibila);
        proxyInternare1.interneazaPacient();
        ProxyInternare proxyInternare2=new ProxyInternare((Spital.Proxy.Internare) internareNepermisa);
        proxyInternare2.interneazaPacient();
    }
}