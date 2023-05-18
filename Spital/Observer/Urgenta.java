package Spital.Observer;

import java.util.ArrayList;
import java.util.List;

// 4. Subject concret
public class Urgenta implements IUrgenta{
    private List<IPacient>pacientiAbonati;

    public Urgenta() {
        this.pacientiAbonati = new ArrayList<>();
    }

    @Override
    public void adaugaPacient(IPacient iPacient) {
        this.pacientiAbonati.add(iPacient);
    }

    @Override
    public void stergePacient(IPacient iPacient) {
        this.pacientiAbonati.remove(iPacient);
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for(IPacient pacient:pacientiAbonati){
            pacient.receptioneazaNotificare(notificare);
        }
    }

    public void alerteazaVirusNou(){
        trimiteNotificare("A aparut un nou virus!");
    }
}
