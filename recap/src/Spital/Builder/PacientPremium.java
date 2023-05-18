package Spital.Builder;

public class PacientPremium implements Pacient{

    //atribute basic
    String nume;
    String diagnostic;

    //atribute extra
    boolean patRabatabil;
    boolean micDejun;
    boolean papuciCamera;
    boolean halatInterior;

    //setteri basic
    @Override
    public void setNume(String nume) {
        this.nume=nume;
    }

    @Override
    public void setDiagnostic(String diagnostic) {
        this.diagnostic=diagnostic;
    }

    //setteri extra
    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "PacientPremium{" +
                "nume='" + nume + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }
}
