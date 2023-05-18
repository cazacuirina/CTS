package Restaurant.Prototype;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class RegistruRezervari {
    Map<String, IContClient>conturi;

    public RegistruRezervari(){
        conturi=new HashMap<String, IContClient>();
    }

    public Rezervare creareRezervare(String nume, String email, int telefon, int nrPers, LocalDate data) {
        try {
            IContClient contClient;
            if(conturi.get(nume)!=null){
                contClient=conturi.get(nume).clone();
            }else{
                contClient=new ContClient(nume, email, telefon);
                conturi.put(nume, contClient);
            }
            return new Rezervare(contClient, nrPers, data);
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Map<String, IContClient> getConturi() {
        return conturi;
    }
}
