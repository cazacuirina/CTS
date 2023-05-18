package Spital.Composite;

// Node interface
public interface DiviziuneSpital {
    void adauga(DiviziuneSpital diviziuneSpital) throws Exception;
    void sterge(DiviziuneSpital diviziuneSpital) throws Exception;
    void modifica(int pozitie, DiviziuneSpital diviziuneSpital) throws Exception;
    DiviziuneSpital getDiviziune(int pozitie) throws Exception;
    void descrie();
}
