package Spital.Strategy;

// 2. Clasa strategie specifica
public class PlataCash implements Plata{
    @Override
    public void plata() {
        System.out.println("Plata cash");
    }
}
