package Spital.Builder;

public interface IBuilder {

    //setteri basic
    void buildNume(String nume);
    void buildDiagnostic(String diagnostic);

    //get obiect abstract
    Pacient getPacient();
}
