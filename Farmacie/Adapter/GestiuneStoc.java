package Farmacie.Adapter;

public class GestiuneStoc implements Gestiune{
    int id;
    int cantitate;

    public GestiuneStoc() {
        this.id = 102;
        this.cantitate = 4;
    }

    @Override
    public boolean verificaStoc(int id, int cantitate) {
        if (this.id == id) {
            if (this.cantitate > cantitate) {
                this.cantitate -= cantitate;
                System.out.println("STOC: Am vandut " + cantitate + " buc medicament cu id " + this.id);
                return true;
            }
        }
        System.out.println("Medicamentul cu id " + this.id + " e indisponibil");
        return false;
    }
}
