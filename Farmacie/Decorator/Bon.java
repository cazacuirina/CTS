package Farmacie.Decorator;

public class Bon implements IBon {
    @Override
    public void printBon() {
        System.out.println("Bonul a fost emis");
    }
}
