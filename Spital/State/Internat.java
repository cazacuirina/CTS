package Spital.State;

// 2. stare concreta
public class Internat implements StarePacient{
    @Override
    public void schimbaStarea(Pacient pacient) {
        if(pacient.getStarePacient() == null){
            System.out.println("Pacientul "+pacient.getNume()+" este internat");
            pacient.setStarePacient(this);
        }

    }
}
