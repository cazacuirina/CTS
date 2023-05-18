package Spital.Facade;

import java.util.ArrayList;
import java.util.List;

// 1. Framework class
public class Salon {
    List<Boolean>paturiDisponibile=new ArrayList<Boolean>();

    private static Salon salon;
    private Salon() {
        for(int i=0; i<10; i++){
            this.paturiDisponibile.add(false);
        }
    }

    public static Salon getInstance(){
        if(salon==null){
            salon=new Salon();
        }
        return salon;
    }

    public List<Boolean> getPaturiDisponibile() {
        return paturiDisponibile;
    }

    public void ocupaPat(int pozitie){
        this.paturiDisponibile.set(pozitie, true);
    }
    public int gasestePatLiber() {
        int pozitie=0, pat=0;
        while(pozitie<paturiDisponibile.size()){
            if(paturiDisponibile.get(pozitie)){
                pat=pozitie;
            }
            pozitie++;
        }
        return pat;
    }
}
