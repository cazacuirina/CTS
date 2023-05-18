package Restaurant.Builder;

public interface BuilderRezervare {
    //setteri basic
    void buildMasa(int nrMasa);
    void buildNrPersoane(int nrPersoane);

    //get obiect asbtract
    Rezervare getRezervare();
}
