package Restaurant.Strategy;

public class OperatorRezervari {
    private Rezervare rezervare;

    public void alegeZona(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public void confirmaRezervare(){
        this.rezervare.setabilesteRezervare();
    }
}
