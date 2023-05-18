package Spital.Composite;

// Leaf Node
public class Sectie implements DiviziuneSpital{
    String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adauga(DiviziuneSpital diviziuneSpital) throws Exception {
        throw new Exception("Nu e implementata");
    }

    @Override
    public void sterge(DiviziuneSpital diviziuneSpital) throws Exception {
        throw new Exception("Nu e implementata");
    }

    @Override
    public void modifica(int pozitie, DiviziuneSpital diviziuneSpital) throws Exception {
        throw new Exception("Nu e implementata");
    }

    @Override
    public DiviziuneSpital getDiviziune(int pozitie) throws Exception {
        throw new Exception("Nu e implementata");
    }

    @Override
    public String toString() {
        return "Sectie{" +
                "denumire='" + denumire + '\'' +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
