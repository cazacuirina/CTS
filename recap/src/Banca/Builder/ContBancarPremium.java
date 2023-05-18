package Banca.Builder;

public class ContBancarPremium implements ContBancarBasic{
    //atribute basic
    String nume;
    double suma;

    //atribute extra
    boolean primesteSalariu;
    boolean cardAtasat;
    boolean internetBanking;

    //setter basic din interfata
    @Override
    public void setDetinator(String nume) {
        this.nume=nume;
    }

    @Override
    public void setSuma(double suma) {
        this.suma=suma;
    }

    //setteri atribute extra
    public void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "ContBancarPremium{" +
                "nume='" + nume + '\'' +
                ", suma=" + suma +
                ", primesteSalariu=" + primesteSalariu +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
