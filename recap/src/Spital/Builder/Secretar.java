package Spital.Builder;

public class Secretar {
    IBuilder builder;

    //constructor builder
    public Secretar(IBuilder builder) {
        this.builder = builder;
    }

    //metoda build
    public IBuilder buildPacient(String nume, String diagnostic, boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halatInterior){
        //setteri basic
        builder.buildNume(nume);
        builder.buildDiagnostic(diagnostic);

        //setteri extra
        if(builder instanceof BuilderPacient){
            ((BuilderPacient)builder).buildMicDejun(micDejun);
            ((BuilderPacient)builder).buildHalatInterior(halatInterior);
            ((BuilderPacient)builder).buildPapuciCamera(papuciCamera);
            ((BuilderPacient)builder).buildPatRabatabil(patRabatabil);
        }

        return builder;
    }

    //get obiect
    public Pacient getPacientCreat(){
        return builder.getPacient();
    }

}
