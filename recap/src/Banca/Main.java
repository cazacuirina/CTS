package Banca;

import Banca.Builder.*;
import Banca.FactoryMethod.Client;
import Banca.FactoryMethod.FactoryPersFizica;
import Banca.FactoryMethod.FactoryPersJuridica;
import Banca.Prototype.ContBancar;
import Banca.Prototype.ContRecord;
import Banca.Prototype.ICont;
import Banca.Singleton.BazaDateTranzactii;
import Spital.Builder.BuilderPacient;
import Spital.Builder.IBuilder;
import Spital.Builder.Pacient;
import Spital.Builder.Secretar;
import Spital.FactoryMethod.AsistentFactory;
import Spital.FactoryMethod.BrancardierFactory;
import Spital.FactoryMethod.MedicFactory;
import Spital.FactorySimple.Factory;
import Spital.FactorySimple.Personal;
import Spital.FactorySimple.TipPersonal;
import Spital.Prototype.RecordReteta;
import Spital.Prototype.Reteta;
import Spital.Singleton.ServerSpital;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

         /*SINGLETON: Banca detine o baza de date ce retine date despre tranzactiile utilizatorilor. Sa se implementeze un sistem
         care sa asigure accesul la baza de date printr-o unica instantiere a acesteia.
         */
        System.out.println("SINGLETON");

        BazaDateTranzactii bazaDateTranzactii=BazaDateTranzactii.getInstance();
        bazaDateTranzactii.adaugaInregistrari(30);
        bazaDateTranzactii.descrie();


        /*FACTORY METHOD:  Banca oferă servicii pentru persoane juridice și pentru persoane fizice. Să se implementeze
        modulul care construiește obiecte din familia de clienți ai băncii. Modulul trebuie realizat, astfel
        încât pentru adăugări de noi tipuri de clienți să nu fie necesare modificări în codul existent.
         */
        System.out.println("FACTORY METHOD");

        FactoryPersFizica factoryPersFizica=new FactoryPersFizica();
        FactoryPersJuridica factoryPersJuridica=new FactoryPersJuridica();

        List<Client> clients=new ArrayList<Client>();
        clients.add(factoryPersFizica.getClient());
        clients.add(factoryPersJuridica.getClient());

        for(Client c: clients){
            c.descrie();
        }


        /*BUILDER:  Banca pune la dispoziția clienților posibilitatea de creare de conturi pentru care dacă un client
        dorește poate să seteze să fie contul în care să primească salariul, să fie cu card atașat sau să aibă
        internet banking. În cazul în care clientul nu setează aceste informații, contul este creat fără aceste
        facilități.
         */
        System.out.println("BUILDER");

        BuilderContBasic builderContBasic=new BuilderContPremium();
        Bancher bancher=new Bancher(builderContBasic);
        ContBancarBasic contBancarBasic=bancher.build("Ana", 2999.55, true, false, true).getCont();
        contBancarBasic.descrie();

        /*PROTOTYPE:  Banca dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client deține
        deja un cont la bancă și dorește deschiderea unui nou cont să nu fie necesară reconstruirea datelor
        despre respectivul client, deoarece prin construire clientul trebuie să prezinte iar documentele
        necesare precum buletin și cardul de credit pentru plată
         */
        System.out.println("PROTOTYPE");

        ContRecord contRecord=new ContRecord();
        contRecord.createPrototype("Sandra", 10, List.of("Buletin", "Contract"));
        contRecord.createPrototype("Alina", 20, List.of("Buletin", "Carte de munca"));
        contRecord.getCont("Alina", 30);  //copie
    }
}