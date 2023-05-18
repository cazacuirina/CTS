package Spital.Adapter;

// 4. Object adapter
public class MedicamentFarmacieAdaptatObiect implements Medicament{

    MedicamentFarmacieOriginal medicamentFarmacieOriginal;

    public MedicamentFarmacieAdaptatObiect(MedicamentFarmacieOriginal medicamentFarmacieOriginal) {
        this.medicamentFarmacieOriginal = medicamentFarmacieOriginal;
    }

    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        this.medicamentFarmacieOriginal.cumpărăMedicament();
    }

    @Override
    public void prezintaReteta() {
        System.out.println("A fost prezentata reteta:\n"+ this.medicamentFarmacieOriginal.toString());
    }
}
