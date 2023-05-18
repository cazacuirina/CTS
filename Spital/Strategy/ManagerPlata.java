package Spital.Strategy;

// 3. Manager care seteaza si efectueaza strategia la runtime
public class ManagerPlata {
    private Plata plata;

    public void alegePlata(Plata plata) {
        this.plata = plata;
    }

    public void plateste(){
        this.plata.plata();
    }
}
