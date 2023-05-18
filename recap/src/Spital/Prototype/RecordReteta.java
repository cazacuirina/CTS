package Spital.Prototype;

import java.util.HashMap;
import java.util.Map;

public class RecordReteta {
    Map<String, Reteta> records=new HashMap<String , Reteta>();

    public RecordReteta() {
        this.records.put("Nurofen", new RetetaNurofen());
        this.records.put("Panadol", new RetetaPanadol());
    }

    public Reteta genereazaReteta(String tipReteta, String substanta, int cantitate){
        try {
            //clonare dupa tipul retetei
            Reteta reteta=records.get(tipReteta).clone();

            //resetare atribute
            reteta.setCantitate(cantitate);
            reteta.setSubstanta(substanta);

            //afisare
            reteta.descrie();

            //returnare obiect nou creat
            return  reteta;

        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
