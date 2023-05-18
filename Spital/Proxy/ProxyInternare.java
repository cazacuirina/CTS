package Spital.Proxy;

// 4. proxy - control acces
public class ProxyInternare implements IInternare{
    Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void interneazaPacient() {
        if(internare.getPacient().areAsigurareMedicala()){
            this.internare.interneazaPacient();
        }else{
            System.out.println("Internare esuata. Pacientul nu are card de sanatate");
        }
    }
}
