package Spital.Decorator;

import java.util.HashMap;
import java.util.Map;

// 2.Concrete product
public class Rezultat implements IRezultat{
    String concluzii;
    Map<String, Integer>valoriAnalize=new HashMap<String,Integer>();

    public Rezultat(String concluzii, Map<String, Integer> valoriAnalize) {
        this.concluzii = concluzii;
        this.valoriAnalize = valoriAnalize;
    }

    @Override
    public String toString() {
        return "Rezultat{" +
                "concluzii='" + concluzii + '\'' +
                ", valoriAnalize=" + valoriAnalize +
                '}';
    }

    @Override
    public void printeazaRezultat() {
        System.out.println(this.toString());
    }
}
