package Banca.Prototype;

import java.util.ArrayList;
import java.util.List;

public class ContBancar implements ICont{
    String detinator;
    double suma;
    List<String> documente=new ArrayList<String>();
    @Override
    public void setDetinator(String detinator) {
        this.detinator=detinator;
    }

    @Override
    public void setSuma(double suma) {
        this.suma=suma;
    }

    @Override
    public void setDocumente(List<String> documente) {
        this.documente=documente;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "detinator='" + detinator + '\'' +
                ", suma=" + suma +
                ", documente=" + documente +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }

    @Override
    public ICont clone() {
        ICont contCopiat=new ContBancar();
        contCopiat.setDetinator(this.detinator);
        contCopiat.setSuma(this.suma);

        List<String>docAux=new ArrayList<String>();
        for(String doc:documente){
            docAux.add(doc);
        }
        contCopiat.setDocumente(docAux);

        return contCopiat;
    }
}
