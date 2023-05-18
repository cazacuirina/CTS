package Banca.Builder;

public class Bancher {
    BuilderContBasic builder;

    //constructor builder
    public Bancher(BuilderContBasic builder) {
        this.builder = builder;
    }

    //metoda build
    public BuilderContBasic build(String nume, double suma, boolean cardAtasat, boolean internetBanking, boolean primesteSalariu){
        //setteri basic
        builder.buildNume(nume);
        builder.buildSuma(suma);

        //setteri extra
        if(builder instanceof BuilderContPremium){
            ((BuilderContPremium)builder).buildCardAtasat(cardAtasat);
            ((BuilderContPremium)builder).buildInternetBanking(internetBanking);
            ((BuilderContPremium)builder).buildPrimesteSalariu(primesteSalariu);
        }else{
            ((BuilderContPremium)builder).buildCardAtasat(false);
            ((BuilderContPremium)builder).buildInternetBanking(false);
            ((BuilderContPremium)builder).buildPrimesteSalariu(false);
        }

        return builder;
    }

    public ContBancarBasic getObiectCreat(){
        return builder.getCont();
    }
}
