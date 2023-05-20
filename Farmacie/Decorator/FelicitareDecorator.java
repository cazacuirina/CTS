package Farmacie.Decorator;

public class FelicitareDecorator extends Felicitare{
    public FelicitareDecorator(IBon bon) {
        super(bon);
    }

    @Override
    public void printFelicitare() {
        System.out.println("Aniversare fericita");
    }
}
