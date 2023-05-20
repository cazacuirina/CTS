package Restaurant.Strategy;

public class RezervareTerasa implements Rezervare{
    @Override
    public void setabilesteRezervare() {
        System.out.println("Rezervare facuta la terasa");
    }
}
