package Spital.Memento;

import java.util.ArrayList;
import java.util.List;

// 1. Clasa de salvat
public class Pacient {
    String nume;
    List<String> boli;

    public Pacient(String nume, List<String> boli) {
        this.nume = nume;
        this.boli = new ArrayList<>(boli);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", boli=" + boli +
                '}';
    }

    public void afisarePacient(){
        System.out.println(this.toString());
    }

    // setare atribute care se modifica des (bolile NU numele)
    public void setBoli(String boala) {
        this.boli.add(boala);
    }

    // salvare si restaurare istoric
    public MementoPacient salvareIstoric(){
         return new MementoPacient(boli);
    }
    public void restaurareIstoric(MementoPacient mementoPacient){
        this.boli=mementoPacient.getBoli();
    }
}
