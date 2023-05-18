package Banca.Prototype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContRecord {
    Map<String, ICont> records=new HashMap<String, ICont>();

    public ContRecord(){}

    public void createPrototype(String nume, double suma, List<String>documente){
        ContBancar contBancar=new ContBancar();
        contBancar.setDetinator(nume);
        contBancar.setSuma(suma);
        contBancar.setDocumente(documente);

        records.put(nume, contBancar);
    }

    public ICont getCont(String nume, double suma){
        ICont cont=records.get(nume).clone();
        cont.setSuma(suma);

        if(cont!=null){
            cont.descrie();
        }

        return cont;
    }
}
