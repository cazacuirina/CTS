import Decorator.BaseSubscription;
import Decorator.HDStreamingSubscription;
import Decorator.OfflineViewingDecorator;
import Decorator.Subscription;
import Flyweight.Flyweight;
import Flyweight.FlyweightFactory;
import Proxy.Internet;
import Proxy.ProxyInternet;

public class Main {
    public static void main(String[] args) {
        // DECORATOR
        // fct la runtime
        // Car, RegularCar, CarDecorator - Get descriere+cost, LeatherSeats, AIAssistance
        // vs Builder - compatibil cu ce avem deja in aplicatie (nu modif ce avem deja)

        // Subscriptions - pt adaugare de optiuni offline, HD la un abonament de baza
        Subscription subscription=new BaseSubscription();
        System.out.println("Pas1 DESCRIERE: "+subscription.getDescription()+" - PRET: "+subscription.getPrice());

        subscription=new OfflineViewingDecorator(subscription);
        System.out.println("Pas2 DESCRIERE: "+subscription.getDescription()+" - PRET: "+subscription.getPrice());

        subscription=new HDStreamingSubscription(subscription);
        System.out.println("Pas3 DESCRIERE: "+subscription.getDescription()+" - PRET: "+subscription.getPrice());


        // FLYWEIGHT
        // vs prototype - obiecte identice apoi modif tot (dureaza crearea) VS obiecte cu parti comune apoi adaugi parti extra (consuma memorie)
        // Player, PlayerFactory (switch dupa tip transmis), Terrorist, CounterTerrorist (gaming - economisire memorie - elem repetitive)
        // VEZI ORDINE APEL METODE (sa nu refere aceeasi zona si sa suprascrie partile extrinseci)
        // obiecte FINALE - NU se mai pot modifica
        // in MAP - dezvolta tipurile sa fie diferite sa nu se suprascrie SAU Terrorist factory

        // flyweight - DOC PLATF PUS PE GIT!
        FlyweightFactory factory = new FlyweightFactory();

        // The first time a flyweight is requested, a new instance is created
        Flyweight flyweight1 = factory.getFlyweight("key1");
        flyweight1.operation();

        // Subsequent requests for the same flyweight return the same instance
        Flyweight flyweight2 = factory.getFlyweight("key1");
        flyweight2.operation();


        // PROXY
        // bariera securitate - permite vs respinge acces
        // Internet, RealInternet, ProxyInternet (validare IP)

        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("www.hm.com");
            internet.connectTo("www.site1.com");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
     /*  se creează un obiect de tip ProxyInternet și se apelează metoda connectTo()
     pentru două servere diferite. Dacă server-ul este unul dintre site-urile interzise,
     atunci se va arunca o excepție și utilizatorul nu va fi conectat la server-ul respectiv.  */

    }
}