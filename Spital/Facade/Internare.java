package Spital.Facade;

// 2. Spital.Facade
public class Internare {

    public void realizeazaInternare(String numePacient, boolean stareGrava, String diagnostic, String numeMedic, String specializare){
        Pacient pacient=new Pacient(numePacient, stareGrava, diagnostic);
        Medic medic=new Medic(numeMedic, specializare);
        if(medic.decideInternare(pacient)){
            //SALONUL E SINGLETON - ne trebuie un singur salon pt a gestiona toate paturile
            Salon salon=Salon.getInstance();
            System.out.println("Lista paturi: "+salon.getPaturiDisponibile());

            int pat=salon.gasestePatLiber();

            if(salon.getPaturiDisponibile().size() > pat){
                System.out.println("Pacientul "+pacient.toString()
                +" va fi internat la patul "+pat
                +" si supravegheat de medicul "+medic.toString());

                salon.ocupaPat(pat);
            }else{
                System.out.println("Pacientul nu poate fi internat. Salonul este plin.");
            }
        }else{
            System.out.println("Pacientul "+pacient.toString()+" nu trebuie internat");
        }
    }
}
