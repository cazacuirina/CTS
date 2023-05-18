package Spital.Adapter;

// 4. Class adapter
public class MedicamentFarmacieAdaptatClasa extends MedicamentFarmacieOriginal implements Medicament{
    public MedicamentFarmacieAdaptatClasa(double pret, String denumire, String substanta) {
        super(pret, denumire, substanta);
    }

    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        super.cumpărăMedicament();
    }

    @Override
    public void prezintaReteta() {
        System.out.println("A fost prezentata reteta:\n"+ super.toString());
    }
}
