package Spital.Adapter;

// 3. New concrete product - ADAPTEE
public class MedicamentFarmacieOriginal {
    double pret;
    String denumire;
    String substanta;

    public MedicamentFarmacieOriginal(double pret, String denumire, String substanta) {
        this.pret = pret;
        this.denumire = denumire;
        this.substanta = substanta;
    }

    @Override
    public String toString() {
        return "MedicamentFarmacieOriginal{" +
                "pret=" + pret +
                ", denumire='" + denumire + '\'' +
                ", substanta='" + substanta + '\'' +
                '}';
    }

    public void cumpărăMedicament(){
        System.out.println("A fost achizitionat din farmacie medicamentul: "+this.denumire);
    }
}
