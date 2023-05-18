package Restaurant.Proxy;

// 3. Clasa restrictionata / conditionata
public class RezervareProxy implements IRezervare{
    private  Rezervare rezervare;
    public RezervareProxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void afiseazaRezervare() {
        if(this.rezervare.getNrPers()<4){
            System.out.println("Prezentati-va in ziua dorita. Sunt mese de 2 pers libere!");
        }else{
            rezervare.afiseazaRezervare();
        }
    }
}
