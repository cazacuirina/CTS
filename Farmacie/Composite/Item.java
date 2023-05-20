package Farmacie.Composite;

public class Item implements Component{
    private String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseazaComponenta() {
        System.out.println(denumire);
    }
}
