package Farmacie.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    Map<String, IClient>clienti;
    public RegistruClienti(){
        this.clienti=new HashMap<>();
    }

    public IClient inregistreazaClient(String codInregistrare, String nume, int nrAsigurare){
        IClient client;
        if(clienti.containsKey(codInregistrare)){
            System.out.println("Client FIDEL");
            client=clienti.get(codInregistrare);
        }else{
            client=new Client(nume, nrAsigurare);
            System.out.println("Client NOU");
            clienti.put(codInregistrare, client);
        }
        return client;
    }
}
