package Spital.Memento;

import java.util.HashMap;
import java.util.Map;

// 3. Clasa care retine versiunile
public class IstoricMedical {
    Map<String, MementoPacient>registruBoli=new HashMap<>(); //merge si list<Memento>

    public void adaugaMemento(MementoPacient mementoPacient, String data){
        registruBoli.put(data, mementoPacient);     //lista.add(memento)
    }

    // getMemento(int index) - return lista.get(index)
    public MementoPacient getMemento(String data){
        if(registruBoli.containsKey(data)){
            return registruBoli.get(data);
        }
        return null;
    }
}
