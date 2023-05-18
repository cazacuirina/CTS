package Restaurant.Flyweight;

import java.util.HashMap;

// 3. Registru clienti
public class FabricaClienti {
    HashMap<String , Client>clienti;

    public FabricaClienti() {
        this.clienti = new HashMap<>();
    }

    public Client gasesteClient(String nume, String telefon, String mail){
        Client client;
        if(clienti.containsKey(nume)){
            client= clienti.get(nume);
        }else{
            client=new Client(nume, mail, telefon);
            clienti.put(nume, client);
        }
        return client;
    }
}
