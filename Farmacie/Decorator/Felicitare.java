package Farmacie.Decorator;

public abstract class Felicitare implements IBon{
    private IBon bon;

    public Felicitare(IBon bon) {
        this.bon = bon;
    }

    @Override
    public void printBon() {
        this.bon.printBon();
    }

    public abstract void printFelicitare();
}
