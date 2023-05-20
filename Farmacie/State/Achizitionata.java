package Farmacie.State;

public class Achizitionata implements StareReteta{
    @Override
    public void schimbaStare(Reteta reteta) {
        if(! (reteta.getStareReteta() instanceof Achizitionata)){
            System.out.println("Reteta nr"+reteta.getNrReteta()+" cu pretul "+"a fost Achizitionata");
            reteta.setStareReteta(this);
        }

    }
}