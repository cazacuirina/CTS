package Restaurant.Flyweight;

import java.util.ArrayList;
import java.util.List;

// 2. Clasa concreta COMUNA/INTRINSECA
public class Client implements IClient{
    String nume;
    String mail;
    String telefon;
    List<Rezervare> rezervari=new ArrayList<>();

    public Client(String nume, String mail, String telefon) {
        this.nume = nume;
        this.mail = mail;
        this.telefon = telefon;
    }

    public void adaugaRezervare(Rezervare r){
        rezervari.add(r);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", mail='" + mail + '\'' +
                ", telefon='" + telefon + '\'' +
                ", rezervari='" + rezervari + '\'' +
                '}';
    }

    @Override
    public void afiseazaClient() { // !! Rezervare r - trimiti aici direct sa nu mai ocupi memoria cu lista de rezervari
        System.out.println(this.toString());
       // r.afiseazaRezervare();
    }
}
