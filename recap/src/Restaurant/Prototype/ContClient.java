package Restaurant.Prototype;

public class ContClient implements IContClient{
    String nume;
    String email;
    long telefon;

    public ContClient(String nume, String email, long telefon) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
    }

    @Override
    public void setNume(String nume) {
        this.nume=nume;
    }

    @Override
    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public void setTelefon(long telefon) {
        this.telefon=telefon;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

    @Override
    public void descrie() {
        System.out.println(this.toString());
    }

    @Override
    public IContClient clone() throws CloneNotSupportedException {
        return (ContClient)super.clone();
    }
}
