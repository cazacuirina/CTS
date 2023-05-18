package Banca.Singleton;

public class BazaDateTranzactii {
    String fisier;
    int noInregistrari;

    //instanta unica statica
    static BazaDateTranzactii bazaDate;

    //constructor privat
    private BazaDateTranzactii() {
        this.fisier="baza.db";
        this.noInregistrari=0;
    }

    //creare /recuperare instanta unica - publica, statica, (sincrona)
    public static BazaDateTranzactii getInstance(){
        if(bazaDate==null){
            bazaDate = new BazaDateTranzactii();
        }
        return bazaDate;
    }

    public void adaugaInregistrari(int noInregistrari) {
        this.noInregistrari += noInregistrari;
    }

    @Override
    public String toString() {
        return "BazaDateTranzactii{" +
                "fisier='" + fisier + '\'' +
                ", noInregistrari=" + noInregistrari +
                '}';
    }
    public void descrie(){
        System.out.println(this.toString());
    }
}
