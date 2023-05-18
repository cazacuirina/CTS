package Spital.Facade;

// 1. Framework class
public class Medic {
    String nume;
    String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "nume='" + nume + '\'' +
                "specializare='" + specializare + '\'' +
                '}';
    }
    public boolean decideInternare(Pacient pacient){
        if(pacient.verificaStare()){
            return true;
        }
        return false;
    }
}
