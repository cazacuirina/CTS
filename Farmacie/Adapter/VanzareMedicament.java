package Farmacie.Adapter;

public class VanzareMedicament {
    int id;
    int cantitate;

    public VanzareMedicament() {
        this.cantitate=10;
    }
    public void setareMedicament(int id){
        this.id=id;
    }
    public boolean verificaDisponibilitate(int cantitate){
        if(this.cantitate>cantitate){
            this.cantitate-=cantitate;
            System.out.println("VANZARE: Am vandut "+cantitate+" buc medicament cu id "+this.id);
            return true;
        }
        System.out.println("Medicamentul cu id "+this.id+" e indisponibil");
        return false;
    }
}
