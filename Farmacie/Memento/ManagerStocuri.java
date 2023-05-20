package Farmacie.Memento;

import java.util.HashMap;
import java.util.Map;

public class ManagerStocuri {
    private Map<String, MementoStoc> registruStocuri;

    public ManagerStocuri(){
        registruStocuri=new HashMap<>();
    }

    public void adaugaMemento(String luna, MementoStoc mementoStoc){
        if(!registruStocuri.containsKey(luna)){
            registruStocuri.put(luna, mementoStoc);
        }
    }

    public MementoStoc reseteazaMemento(String luna){
        if(registruStocuri.containsKey(luna)){
           return registruStocuri.get(luna);
        }
        return null;
    }
}