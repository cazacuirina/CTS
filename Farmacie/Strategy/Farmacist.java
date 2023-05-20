package Farmacie.Strategy;

public class Farmacist {
    private IVanzare vanzare;

    public Farmacist(IVanzare vanzare) {
        this.vanzare = vanzare;
    }

    public void vindeMedicament(){
        this.vanzare.vindeMedicament();
    }
}
