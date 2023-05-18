package Restaurant.Composite;

import java.util.ArrayList;
import java.util.List;

// 2. Nod composite
public class SectiuneMeniu implements ComponentaMeniu{
    String denumire;
    List<ComponentaMeniu>componente;

    public SectiuneMeniu(String denumire) {
        this.denumire = denumire;
        this.componente =new ArrayList<>();
    }

    public void adaugaComponenta(ComponentaMeniu c){
        componente.add(c);
    }

    public void eliminaComponenta(ComponentaMeniu c){
        componente.remove(c);
    }

    public void schimbaComponente(ComponentaMeniu c1, ComponentaMeniu c2){
        int i1=componente.indexOf(c1);
        int i2=componente.indexOf(c2);
        componente.set(i1, c2);
        componente.set(i2, c1);
    }
    @Override
    public void afiseazaItem() {
        System.out.println(denumire);

        for(ComponentaMeniu c:componente){
            c.afiseazaItem();
        }
    }
}
