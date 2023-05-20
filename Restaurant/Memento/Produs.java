package Restaurant.Memento;

public class Produs {
    String denumire;
    double pret;

    public Produs(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public MementoProdus salveazaProdus(){
        return new MementoProdus(this.pret);
    }

    public void restaureazaProdus(MementoProdus mementoProdus){
        this.pret=mementoProdus.getPret();
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }

    public void afiseazaProdus(){
        System.out.println(this.toString());
    }

}
