package Restaurant.Memento;

import java.util.HashMap;
import java.util.Map;

public class MeniuManager {
    private Map<String, MementoProdus>produse;

    public MeniuManager() {
        this.produse =new HashMap<>();
    }

    public void adaugaMemento(MementoProdus mementoProdus, String data){
        if(! this.produse.containsKey(data)){
            this.produse.put(data,mementoProdus);
        }
    }

    public MementoProdus getMemento(String data){
        if(this.produse.containsKey(data)){
            return this.produse.get(data);
        }
        return null;
    }
}
