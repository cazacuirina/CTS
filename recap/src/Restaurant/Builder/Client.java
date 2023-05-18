package Restaurant.Builder;

public class Client {
    BuilderRezervare builderRezervare;

    public Client(BuilderRezervare builderRezervare) {
        this.builderRezervare = builderRezervare;
    }

    public Rezervare buildRezervare(int nrMasa, int nrPers, boolean geam, boolean scaune, boolean decorare,boolean muzica, String gen){
        builderRezervare.buildMasa(nrMasa);
        builderRezervare.buildNrPersoane(nrPers);

        if(builderRezervare instanceof BuilderRezervareExtra){
            ((BuilderRezervareExtra)builderRezervare).buildașezareGeam(geam);
            ((BuilderRezervareExtra)builderRezervare).buildscauneErgonomice(scaune);
            ((BuilderRezervareExtra)builderRezervare).builddecorareMasa(decorare);
            ((BuilderRezervareExtra)builderRezervare).buildmuzicaAmbientala(muzica);
            ((BuilderRezervareExtra)builderRezervare).buildgenMuzica(gen);

        }

        return builderRezervare.getRezervare();
    }

    public Rezervare getRezervareCreata(){
        return this.builderRezervare.getRezervare();
    }
}
