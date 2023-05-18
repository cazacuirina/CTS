package Spital.Decorator;

// 4.Concrete Spital.Decorator
public class PlatformaRezultate extends FisaRezultate{
    public PlatformaRezultate(IRezultat iRezultat) {
        super(iRezultat);
    }
    @Override
    public void afiseazaPePlatforma() {
        System.out.println("Rezultate disponibile la adresa: www.synevo.ro");
    }
}
