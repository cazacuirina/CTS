package Restaurant.Prototype;

import java.time.LocalDate;

public class Rezervare {
    IContClient contClient;
    int nrPers;
    LocalDate data;
    public Rezervare(IContClient contClient, int nrPers, LocalDate data) {
        this.contClient = contClient;
        this.nrPers = nrPers;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "contClient=" + contClient +
                ", nrPers=" + nrPers +
                ", data=" + data +
                '}';
    }

    void descrie(){
        System.out.println(this.toString());
    }
}
