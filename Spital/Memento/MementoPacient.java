package Spital.Memento;

import java.util.ArrayList;
import java.util.List;

// 2. Clasa care retine atributele care trb salvate
public class MementoPacient {
    private List<String> boli;

    // ATENTIE la referinte! (aloca spatiu nou)
    public MementoPacient(List<String> boli) {
        this.boli = new ArrayList<>(boli);
    }

    public List<String> getBoli() {
        return boli;
    }
}
