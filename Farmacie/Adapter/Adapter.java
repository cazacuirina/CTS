package Farmacie.Adapter;

public class Adapter implements Gestiune{
    private VanzareMedicament vanzareMedicament;

    public Adapter(VanzareMedicament vanzareMedicament) {
        this.vanzareMedicament = vanzareMedicament;
    }

    @Override
    public boolean verificaStoc(int id, int cantitate) {
        this.vanzareMedicament.setareMedicament(id);
        if(this.vanzareMedicament.verificaDisponibilitate(cantitate)){
            return true;
        }
        return false;
    }
}
