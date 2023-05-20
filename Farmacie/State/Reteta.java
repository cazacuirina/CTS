package Farmacie.State;

public class Reteta {
    private int nrReteta;
    private double pret;

    private StareReteta stareReteta;

    public Reteta(int nrReteta, double pret) {
        this.nrReteta = nrReteta;
        this.pret = pret;
        StareReteta stare=new Emisa();
        stare.schimbaStare(this);
    }

    public void setStareReteta(StareReteta stareReteta) {
        this.stareReteta = stareReteta;
    }

    public StareReteta getStareReteta() {
        return stareReteta;
    }

    public void solicitaReteta(){
        StareReteta stare=new Solicitata();
        stare.schimbaStare(this);
    }

    public void achizitioneazaMedicamente(){
        StareReteta stare=new Achizitionata();
        stare.schimbaStare(this);
    }
    public int getNrReteta() {
        return nrReteta;
    }

    public double getPret() {
        return pret;
    }
}
