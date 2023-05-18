public class Main {


    public static void main(String[] args) {
        //Design patterns - SINGLETON
        //get instanta public + constructor privat
        //referinta catre instanta unica (la fiecare apel mergem la aceeasi zona de memorie)
        //Utilizare: Baza de date, Chat server

        //NU poti apela constructor pt ca este privat
        // ChatServer chatServer=new ChatServer();

        //acces DOAR prin metoda statica
        ChatServer chatServer=ChatServer.getInstance(8081, "Grupa 1081");
        //System.out.println(chatServer.toString());
        System.out.println(chatServer.showStatus());

        //e aceeasi instanta!
        ChatServer chatServer2=ChatServer.getInstance(8082, "Grupa 1082");
        //System.out.println(chatServer2.toString());
        System.out.println(chatServer2.showStatus());

        //EXEMPLU DE SUBIECT
        //O fabrica de masini care implementeaza un sist centralizat de monitorizare a productiei.
        //Sistemul trb sa asigure adaugarea & modificarea datelor despre masinile fabricate
        //mediu securizat (sist va exista sub forma unui server dispus in datacenter)
        //programatorii trb sa se asigure ca sist nu va putea fi replicat si ca toate datele vor fi manageriate prin singurul server
        //NU factory, NU proxy

        new Thread(()->{
            CarServer carServer=CarServer.getInstance();
            carServer.setNoCars(2);
            System.out.println(carServer.showStatus());
        }).start();

        new Thread(()->{
            CarServer carServer2=CarServer.getInstance();
            carServer2.setNoCars(5);
            System.out.println(carServer2.showStatus());
        }).start();


    }
}