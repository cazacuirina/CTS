package Spital.Builder;

public class BuilderPacient implements IBuilder{

    // Abstract object
    Pacient pacient;

    //constructor FARA parametrii care initializeaza obiectul CONCRET
    public BuilderPacient() {
        this.pacient = new PacientPremium();
    }

    //setteri basic
    @Override
    public void buildNume(String nume) {
        this.pacient.setNume(nume);
    }

    @Override
    public void buildDiagnostic(String diagnostic) {
        this.pacient.setDiagnostic(diagnostic);
    }

    //setteri extra
    public void buildMicDejun(boolean micDejun){
        ((PacientPremium)this.pacient).setMicDejun(micDejun);
    }

    public void buildPatRabatabil(boolean patRabatabil){
        ((PacientPremium)this.pacient).setPatRabatabil(patRabatabil);
    }
    public void buildPapuciCamera(boolean papuciCamera){
        ((PacientPremium)this.pacient).setPapuciCamera(papuciCamera);
    }
    public void buildHalatInterior(boolean halatInterior){
        ((PacientPremium)this.pacient).setHalatInterior(halatInterior);
    }


    //get obiect Abstract
    @Override
    public Pacient getPacient() {
        return this.pacient;
    }
}
