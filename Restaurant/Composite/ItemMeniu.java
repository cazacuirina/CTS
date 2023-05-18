package Restaurant.Composite;

// 3. Nod frunza
public class ItemMeniu implements ComponentaMeniu{
    String denumire;

    public ItemMeniu(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void afiseazaItem() {
        System.out.println(denumire);
    }
}
