package Farmacie.Facade;

import java.util.HashMap;
import java.util.Map;

public class Stoc {
    private Map<String, Integer> stoc=new HashMap<>();

    public Stoc() {
        this.stoc.put("Vitamina C",3);
        this.stoc.put("Nurofen",2);
    }

    public void verificaDisponibilitate(Map medicamente){
        medicamente.forEach((medicament, cantitateDorita) -> {

            if (this.stoc.containsKey(medicament)) {
                int cantitateDisponibila = this.stoc.get(medicament);

                if ((int) cantitateDorita <= cantitateDisponibila) {
                    System.out.println("S-au vandut " + cantitateDorita + " buc de " + medicament);
                } else {
                    System.out.println("Stoc indisponibil pentru " + medicament);
                }

            } else {
                System.out.println("Medicamentul " + medicament + " nu exista");
            }
        });
    }
}
