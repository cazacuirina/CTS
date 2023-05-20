package Restaurant.State;

public class Masa {
    private int nrMasa;
    private StareMasa stareMasa;

    public StareMasa getStareMasa() {
        return stareMasa;
    }

    public void setStareMasa(StareMasa stareMasa) {
        this.stareMasa = stareMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }
    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        StareMasa stare=new Rezervata();
        stare.schimbaStarea(this);

    }

    public void ocupaMasa(){
        StareMasa stare=new Ocupata();
        stare.schimbaStarea(this);
    }
    public void elibereazaMasa(){
        StareMasa stare=new Libera();
        stare.schimbaStarea(this);
    }
}
