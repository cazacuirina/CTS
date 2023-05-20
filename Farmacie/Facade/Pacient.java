package Farmacie.Facade;

import java.util.HashMap;
import java.util.Map;

public class Pacient {
    private boolean areCardSanatate;

    private Map<String, Integer>medicamente=new HashMap<>();

    public Pacient( boolean areCardSanatate) {
        this.areCardSanatate=areCardSanatate;
        this.medicamente.put("Nurofen",3);
        this.medicamente.put("Vitamina C",1);
    }

    public boolean areCardSanatate(){
        return this.areCardSanatate;
    }

    public Map verificaReteta(){
        return this.medicamente;
    }

}
