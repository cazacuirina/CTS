package Restaurant.Builder;

public class RezervareExtra implements Rezervare{
    //atribute basic
    int nrMasa;
    int nrPersoane;

    //atribute extra
    boolean așezareGeam;
    boolean scauneErgonomice;
    boolean decorareMasa;
    boolean muzicaAmbientala;
    String genMuzica;

    //setteri basic
    @Override
    public void setMasa(int nrMasa) {
        this.nrMasa=nrMasa;
    }

    @Override
    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane=nrPersoane;
    }

    //setteri extra
    public void setAșezareGeam(boolean așezareGeam) {
        this.așezareGeam = așezareGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    //afisare
    @Override
    public String toString() {
        return "RezervareExtra{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", așezareGeam=" + așezareGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
