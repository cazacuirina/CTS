package Spital.Flyweight;

import java.util.HashMap;
import java.util.Map;

// 4. fabrica cu registru obiecte comune
public class FabricaPacienti {
    Map<Integer, IPacient>registruPacienti;

    public FabricaPacienti() {
        this.registruPacienti = new HashMap<Integer, IPacient>();
    }

    public IPacient getPacient(int codPacient, String nume, String nrTelefon, String adresa){
        IPacient pacient;

        if(registruPacienti.containsKey(codPacient)){
            pacient = registruPacienti.get(codPacient);
        }else{
            pacient = new Pacient(nume, nrTelefon, adresa);
            registruPacienti.put(codPacient, (Pacient) pacient); //cast!
        }

        return pacient;
    }
}
