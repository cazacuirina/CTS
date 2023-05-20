package Restaurant.Strategy;

public class RezervareInterior implements Rezervare{
    @Override
    public void setabilesteRezervare() {
        System.out.println("Rezervare facuta in interior");
    }
}
