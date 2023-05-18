package Restaurant.Singleton;

public class ServerRestaurant {
    String denumire;
    int nrOperatii;

    //instanta unica - statica
    static ServerRestaurant server;

    //constructor privat
    private ServerRestaurant(String denumire, int nrOperatii) {
        this.denumire = denumire;
        this.nrOperatii = nrOperatii;
    }

    //acces la instanta statica (public, static, sincron)
    public static ServerRestaurant getInstance(String denumire, int nrOperatii){
        if(server==null){
            server=new ServerRestaurant(denumire, nrOperatii);
        }
        return server;
    }

    @Override
    public String toString() {
        return "ServerRestaurant{" +
                "denumire='" + denumire + '\'' +
                ", nrOperatii=" + nrOperatii +
                '}';
    }

    public void descrie(){
        System.out.println(this.toString());
    }
}
