package Restaurant.Facade;

public class FacadeMasa {
    int nrMasa;

    public FacadeMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public void alocaMasa(boolean esteLibera, boolean esteDebarasata, boolean areServetese){
        MasaLibera masaLibera=new MasaLibera(esteLibera);
        MasaDebarasata masaDebarasata=new MasaDebarasata(esteDebarasata);
        ServeteleMasa serveteleMasa=new ServeteleMasa(areServetese);
        if(masaLibera.esteLibera() && masaDebarasata.esteDebarasata() && serveteleMasa.areServetele()){
            System.out.println("Masa "+nrMasa+" poate fi ocupata acum!");
        }else{
            System.out.println("Masa "+nrMasa+" nu poate fi ocupata momentan!");
        }
    }
}
