package Spital.Composite;

import java.util.ArrayList;
import java.util.List;

// Spital.Composite Node
public class Departament implements DiviziuneSpital{
    String denumire;
    List<DiviziuneSpital>subdepartamente;

    public Departament(String denumire) {
        this.denumire = denumire;
        this.subdepartamente = new ArrayList<DiviziuneSpital>();
    }

    @Override
    public void adauga(DiviziuneSpital diviziuneSpital) {
        this.subdepartamente.add(diviziuneSpital);
    }

    @Override
    public void sterge(DiviziuneSpital diviziuneSpital) {
        this.subdepartamente.remove(diviziuneSpital);
    }

    @Override
    public void modifica(int pozitie, DiviziuneSpital diviziuneSpital) {
        this.subdepartamente.set(pozitie, diviziuneSpital);
    }

    @Override
    public DiviziuneSpital getDiviziune(int pozitie) {
        return this.subdepartamente.get(pozitie);
    }

    @Override
    public String toString() {
        return "Departament{" +
                "denumire='" + denumire + '\'' +
                ", subdepartamente=" + subdepartamente +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
