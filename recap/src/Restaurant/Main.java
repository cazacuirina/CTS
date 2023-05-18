package Restaurant;

import Restaurant.Builder.BuilderRezervare;
import Restaurant.Builder.BuilderRezervareExtra;
import Restaurant.Builder.Client;
import Restaurant.Builder.Rezervare;
import Restaurant.FactoryMethod.*;
import Restaurant.Prototype.ContClient;
import Restaurant.Prototype.RegistruRezervari;
import Restaurant.Singleton.ServerRestaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*SINGLETON: Restaurantul are nevoie de un server care sa permita stocarea si manipularea datelor despre clienti si rezevrari.
        Sa se implementeze un sistem care sa asigure accesul la serverul unic (nu se permite replicarea).
        */
        //JUSTIFICARE: se doreste crearea unei unice instante
        System.out.println("SINGLETON");

        ServerRestaurant serverRestaurant=ServerRestaurant.getInstance("Restaurant", 12);
        serverRestaurant.descrie();


        /*BUILDER: Atunci când un client face o rezervare poate alege una din următoarele opțiuni: așezare la geam,
        scaune ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica. În cazul în
        care clientul nu specifică vreun element dintre acestea, este setat pe false. Să se implementeze
        modulul care permite crearea de obiecte de tip rezervare cu aceste opțiuni extra.
        */
        //JUSTIFICARE: se doreste crearea de obiecte de tipuri diferite, care au la baza aceleasi atribute generale,
        // dar la care se pot adauga si atribute optionale pentru crearea de obiecte mai complexe
        System.out.println("BUILDER");

        BuilderRezervare builderRezervare=new BuilderRezervareExtra();
        Client client=new Client(builderRezervare);
        Rezervare rezervare=client.buildRezervare(10,3, true, true, false, true, "Jazz");
        rezervare.descrie();

        /*FACTORY METHOD:
         Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită,
        etc. Să se implementeze modulul care permite realizarea de obiecte din familia supelor. Modulul
        trebuie realizat, astfel încât pentru adăugări de noi tipuri de supă să nu fie necesare modificări în
        codul existent.
        */
        //JUSTIFICARE: se doreste crearea de obiecte dintr-o anumita familie (factory) fara a face code refactoring (method)
        // realizandu-se astfel un nou nivel de abstractizare
        System.out.println("FACTORY METHOD");

        FactorySupaCiuperci factorySupaCiuperci=new FactorySupaCiuperci();
        FactorySupaVita factorySupaVita=new FactorySupaVita();
        FactorySupaLegume factorySupaLegume=new FactorySupaLegume();

        List<Supa>supe=new ArrayList<Supa>();
        supe.addAll(List.of(factorySupaCiuperci.createSupa(), factorySupaLegume.createSupa(), factorySupaVita.createSupa()));
        for(Supa supa:supe){
            supa.descrie();
        }

        /*PROTOTYPE: Restaurantul dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client a
        mai fost la restaurant și revine pentru a fi realiza o rezervare aici să nu fie necesară reconstruirea
        unui cont respectivului client, deoarece prin construire clientului durează foarte mult.
        */
        //JUSTIFICARE: se doreste crearea de obiecte fara a se apela constructorul, intrucat acesta consuma multe resurse
        // utilizandu-se un prototip al unui obiect deja creat
        System.out.println("PROTOTYPE");

        RegistruRezervari registruRezervari=new RegistruRezervari();
        registruRezervari.creareRezervare("Alex", "alex@gmail.com", 721098907, 3, LocalDate.now().plusDays(4));
        registruRezervari.creareRezervare("Andrei", "andrei@gmail.com", 230188752, 4,LocalDate.now().plusDays(2));
        registruRezervari.creareRezervare("Maria", "maria@gmail.com", 789552431, 2, LocalDate.now().plusDays(6));
        registruRezervari.creareRezervare("Alex", "alex@gmail.com", 721098907, 5, LocalDate.now().plusDays(11));

        System.out.println("Prototipuri de conturi: "+registruRezervari.getConturi());

    }
}