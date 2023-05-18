package Spital.State;

// 3. clasa care navigheaza prin stari
public class Pacient {
    private String nume;
    private boolean grava;

    private StarePacient starePacient;

    public StarePacient getStarePacient() {
        return starePacient;
    }

    public void setStarePacient(StarePacient starePacient) {
        this.starePacient = starePacient;
    }

    public Pacient(String nume, boolean grava) {
        this.nume = nume;
        this.grava = grava;
        StarePacient stare=new Internat();
        stare.schimbaStarea(this);
    }

    public String getNume() {
        return nume;
    }

    public boolean isGrava() {
        return grava;
    }

    public void puneSubObservatie(){
        StarePacient stare=new SubObservatie();
        stare.schimbaStarea(this);
    }

    public void externeaza(){
        StarePacient stare=new Externat();
        stare.schimbaStarea(this);
    }
}
