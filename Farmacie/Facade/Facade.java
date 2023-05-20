package Farmacie.Facade;

import java.util.Map;

public class Facade {
    public void vindeMedicamente(boolean card){
        Pacient pacient=new Pacient(card);
        if(pacient.areCardSanatate()){
            Map medicamente=pacient.verificaReteta();
            Stoc stoc=new Stoc();
            stoc.verificaDisponibilitate(medicamente);
        }else{
            System.out.println("Pacient fara card de sanatate");
        }
    }
}
