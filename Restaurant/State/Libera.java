package Restaurant.State;

public class Libera implements StareMasa{
    @Override
    public void schimbaStarea(Masa masa) {
        if(! (masa.getStareMasa() instanceof Libera)){
            System.out.println("Masa nr."+masa.getNrMasa()+" este libera");
            masa.setStareMasa(this);
        }
    }
}
