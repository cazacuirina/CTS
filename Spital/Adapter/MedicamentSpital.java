package Spital.Adapter;

// 2. Initial concrete product
public class MedicamentSpital implements Medicament{
    double pret;
    String denumire;
    String medicFamilie;

    public MedicamentSpital(double pret, String denumire, String medicFamilie) {
        this.pret = pret;
        this.denumire = denumire;
        this.medicFamilie = medicFamilie;
    }

    @Override
    public String toString() {
        return "MedicamentSpital{" +
                "pret=" + pret +
                ", denumire='" + denumire + '\'' +
                ", medicFamilie='" + medicFamilie + '\'' +
                '}';
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("A fost achizitionat din spital medicamentul: "+this.denumire);
    }

    public void prezintaReteta(){
        System.out.println("A fost prezentata reteta:\n" + this.toString());
    }
}
