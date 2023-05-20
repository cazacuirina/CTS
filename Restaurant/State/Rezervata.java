package Restaurant.State;

public class Rezervata implements StareMasa{
    @Override
    public void schimbaStarea(Masa masa) {
        if(! (masa.getStareMasa() instanceof Rezervata)){
            System.out.println("Masa nr."+masa.getNrMasa()+" este rezervata");
            masa.setStareMasa(this);
        }
    }
}
