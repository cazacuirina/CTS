package Banca.Builder;

public class BuilderContPremium implements BuilderContBasic{
    ContBancarBasic contBancarBasic;

    //constructor obiect concret
    public BuilderContPremium() {
        this.contBancarBasic = new ContBancarPremium();
    }

    //set atribute basic
    @Override
    public void buildNume(String nume) {
        this.contBancarBasic.setDetinator(nume);
    }

    @Override
    public void buildSuma(double suma) {
        this.contBancarBasic.setSuma(suma);
    }

    //set atribute extra - CU CAST
    public void buildPrimesteSalariu(boolean primesteSalariu){
        ((ContBancarPremium) this.contBancarBasic).setPrimesteSalariu(primesteSalariu);
    }

    public void buildCardAtasat(boolean cardAtasat){
        ((ContBancarPremium) this.contBancarBasic).setCardAtasat(cardAtasat);
    }

    public void buildInternetBanking(boolean internetBanking){
        ((ContBancarPremium) this.contBancarBasic).setInternetBanking(internetBanking);
    }

    //get obiect abstract
    @Override
    public ContBancarBasic getCont() {
        return this.contBancarBasic;
    }
}
