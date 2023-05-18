package Spital.State;

// 2. stare concreta
public class Externat implements StarePacient{
    @Override
    public void schimbaStarea(Pacient pacient) {
        if(! (pacient.getStarePacient() instanceof Externat)){
            System.out.println("Pacientul "+pacient.getNume()+" este externat");
            pacient.setStarePacient(this);
        }
    }
}
