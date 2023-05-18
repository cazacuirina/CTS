package Spital.State;

// 2. stare concreta
public class SubObservatie implements StarePacient{
    @Override
    public void schimbaStarea(Pacient pacient) {
        if(pacient.getStarePacient() instanceof Internat && pacient.isGrava()){
            System.out.println("Pacientul "+pacient.getNume()+" este sub observatie");
            pacient.setStarePacient(this);
        }
    }
}
