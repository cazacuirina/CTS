package FacadeMasini;

public class DealerAuto {
    MasinaElectrica masinaElectrica;
    MasinaSport masinaSport;
    MasinaFamilie masinaFamilie;

    public DealerAuto() {
        this.masinaElectrica = new MasinaElectrica();
        this.masinaSport = new MasinaSport();
        this.masinaFamilie = new MasinaFamilie();
    }

    public void descrieElectrica(){
        masinaElectrica.descrie();
    }
    public void descrieFamilie(){
        masinaFamilie.descrie();
    } public void descrieSport(){
        masinaSport.descrie();
    }

}
