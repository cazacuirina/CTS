package ro.ase.cts.unittestslab;

import java.util.HashMap;
import java.util.List;

public class Bank {

    //Minim 5 caractere - trebuie sa contina cuvantul "bank"
    private String name;

    //Minim 10 caractere
    private String address;

    //Formatul este: LLLL-LL-LL-CCC  , unde L - litera si C - cifra.
    // Primele 4 litere reprezinta codul bancii
    private String swiftCode;
    private HashMap<String, Client> clientsList;

    public Bank(String name, String address, String swiftCode) {
        this.name = name;
        this.address = address;
        this.swiftCode = swiftCode;
        this.clientsList=new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public void addNewClient(Client c){
        this.clientsList.put(c.getId(), c);
    }
    public Client getClientByCNP(String cnp) {
        return clientsList.get(cnp);
    }
}
