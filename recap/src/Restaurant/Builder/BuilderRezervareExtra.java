package Restaurant.Builder;

public class BuilderRezervareExtra implements BuilderRezervare{

    Rezervare rezervare;

    public BuilderRezervareExtra(){
        //initializare tip concret
        rezervare=new RezervareExtra();
    }

    //setteri basic
    @Override
    public void buildMasa(int nrMasa) {
        this.rezervare.setMasa(nrMasa);
    }

    @Override
    public void buildNrPersoane(int nrPersoane) {
        this.rezervare.setNrPersoane(nrPersoane);
    }

    //setteri extra - CAST
    public void buildașezareGeam(boolean asezareGeam) {
        ((RezervareExtra)this.rezervare).setAșezareGeam(asezareGeam);
    }
    public void buildscauneErgonomice(boolean scauneErgonomice) {
        ((RezervareExtra)this.rezervare).setScauneErgonomice(scauneErgonomice);
    }
    public void builddecorareMasa(boolean decorareMasa) {
        ((RezervareExtra)this.rezervare).setDecorareMasa(decorareMasa);
    }
    public void buildmuzicaAmbientala(boolean muzicaAmbientala) {
        ((RezervareExtra)this.rezervare).setAșezareGeam(muzicaAmbientala);
    }

    public void buildgenMuzica(String genMuzica) {
        ((RezervareExtra)this.rezervare).setGenMuzica(genMuzica);
    }

    //get obiect abstract
    @Override
    public Rezervare getRezervare() {
        return this.rezervare;
    }
}
