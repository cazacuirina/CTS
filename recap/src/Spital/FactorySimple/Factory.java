package Spital.FactorySimple;

public class Factory {
    public Personal createPersonal(TipPersonal tipPersonal){
        switch (tipPersonal){
            case Asistent :{
                return new Asistent();
            }
            case Brancardier:{
                return new Brancardier();
            }
            case Medic :{
                return new Medic();
            }
            default :{
                return null;
            }
        }
    }
}
