package Restaurant.Prototype;

public interface IContClient extends Cloneable{
    void setNume(String nume);
    void setEmail(String email);
    void setTelefon(long telefon);

    void descrie();

    //metode clonare
    IContClient clone() throws CloneNotSupportedException;
}
