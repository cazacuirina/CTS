package Spital.Strategy;

// 2. Clasa strategie specifica
public class PlataCard implements Plata{
    @Override
    public void plata() {
        System.out.println("Plata cu cardul");
    }
}
