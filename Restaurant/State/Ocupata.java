package Restaurant.State;

public class Ocupata implements StareMasa{
    @Override
    public void schimbaStarea(Masa masa) {
        if(! (masa.getStareMasa() instanceof Ocupata)){
            System.out.println("Masa nr."+masa.getNrMasa()+" este ocupata");
            masa.setStareMasa(this);
        }
    }
}
