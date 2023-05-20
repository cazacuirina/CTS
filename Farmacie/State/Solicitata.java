package Farmacie.State;

public class Solicitata implements StareReteta{
    @Override
    public void schimbaStare(Reteta reteta) {
        if(! (reteta.getStareReteta() instanceof Solicitata)){
            System.out.println("Reteta nr"+reteta.getNrReteta()+" cu pretul "+"a fost Solicitata");
            reteta.setStareReteta(this);
        }

    }
}
