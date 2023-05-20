package Farmacie.State;

public class Emisa implements StareReteta{
    @Override
    public void schimbaStare(Reteta reteta) {
        if(! (reteta.getStareReteta() instanceof Emisa)){
            System.out.println("Reteta nr"+reteta.getNrReteta()+" cu pretul "+"a fost Emisa");
            reteta.setStareReteta(this);
        }

    }
}
