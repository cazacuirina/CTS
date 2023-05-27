package ro.ase.cts.unittestslab;

import java.util.ArrayList;
import java.util.List;

public class Client {
    //Minim 5 caractere, trebuie sa contina cel putin un spatiu (Ex.:Nume Prenume)
    private String name;

    //CNP valid
    private String id;
    private List<BankAccount> accounts ;

    public Client(String name, String id) {
        this.name = name;
        this.id = id;
        this.accounts=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addAccount(BankAccount bankAccount) {
        this.accounts.add(bankAccount);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
