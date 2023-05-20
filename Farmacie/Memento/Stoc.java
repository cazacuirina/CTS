package Farmacie.Memento;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stoc {
   int nrMedicamente;
   String furnizor;

    public Stoc(int nrMedicamente, String furnizor) {
        this.nrMedicamente = nrMedicamente;
        this.furnizor = furnizor;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }
    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }

    public MementoStoc salveazaStoc(){
        return new MementoStoc(this.nrMedicamente);
    }
    public void restaureazaStoc(MementoStoc mementoStoc){
        this.nrMedicamente=mementoStoc.getNrMedicamente();
    }

    public void afiseazaStoc(){
        System.out.println("Stoc curent: "+nrMedicamente+" de la furnizorul "+furnizor);
    }
}
