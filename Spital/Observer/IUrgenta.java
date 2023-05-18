package Spital.Observer;

// 3. Subject Abstract
public interface IUrgenta {
    void adaugaPacient(IPacient iPacient);
    void stergePacient(IPacient iPacient);
    void trimiteNotificare(String notificare);
}
