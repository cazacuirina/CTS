package Spital.Decorator;

// 3.Abstract Spital.Decorator
public abstract class FisaRezultate implements IRezultat{
    IRezultat iRezultat;

    public FisaRezultate(IRezultat iRezultat) {
        this.iRezultat = iRezultat;
    }

    @Override
    public void printeazaRezultat() {
        this.iRezultat.printeazaRezultat();
    }

    public abstract void afiseazaPePlatforma();
}
