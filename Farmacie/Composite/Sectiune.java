package Farmacie.Composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Component{
    private List<Component>sectiuni;
    private String denumire;

    public Sectiune(String denumire) {
        this.denumire=denumire;
        this.sectiuni=new ArrayList<>();
    }

    public void adaugaSectiune(Component sectiune){
        sectiuni.add(sectiune);
    }
    public void stergeSectiune(Component sectiune){
        sectiuni.remove(sectiune);
    }
    @Override
    public void afiseazaComponenta() {
        System.out.println(denumire+":");
        for(Component c:sectiuni){
            c.afiseazaComponenta();
        }
    }
}
