package ro.ase.cts.unittestslab;

public class BankAccount {
    // Format: LLCCLLLL################
    // Primele 2 litere - cod de tara, CC - doua cifre de control, LLLL - codul bancii
    private String ibanCode;
    private double amount;

    //Format: LLL (Ex.: RON, EUR, USD)
    private String currency;

    public BankAccount(String ibanCode, double amount, String currency, boolean blocked) {
        this.ibanCode = ibanCode;
        this.amount = amount;
        this.currency = currency;
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void block() {
        this.blocked = true;
    }

    public void unblock() {
        this.blocked = false;
    }
    private boolean blocked;

    public String getIbanCode() {
        return ibanCode;
    }

    public void setIbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
