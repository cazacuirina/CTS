package Spital.Singleton;

public class ServerSpital {
    int port;
    String denumire;

    //instanta statica
    static ServerSpital server;

    //constructor privat
    private ServerSpital(int port, String denumire) {
        this.port = port;
        this.denumire = denumire;
    }

    //creare / recuperare instanta unica - metoda publica, statica, (sincrona)
    public static ServerSpital getInstance(int port, String denumire){
        if(server==null){
            server=new ServerSpital(port, denumire);
        }
        return server;
    }

    @Override
    public String toString() {
        return "ServerSpital{" +
                "port=" + port +
                ", denumire='" + denumire + '\'' +
                '}';
    }

    public void descrie(){
        System.out.println(this.toString());
    }
}
