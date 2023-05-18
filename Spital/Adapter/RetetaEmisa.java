package Spital.Adapter;

// 5. Client
public class RetetaEmisa {
    Medicament medicament;

    public RetetaEmisa(Medicament medicament) {
        this.medicament = medicament;
    }

    public void emiteReteta(){
        medicament.achizitioneazaMedicament();
    }
}
