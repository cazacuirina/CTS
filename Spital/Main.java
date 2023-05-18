package Spital;

import Spital.Memento.IstoricMedical;
import Spital.Memento.Pacient;
import Spital.Observer.IPacient;
import Spital.Observer.PacientAbonat;
import Spital.Observer.Urgenta;
import Spital.Strategy.ManagerPlata;
import Spital.Strategy.PlataCard;
import Spital.Strategy.PlataCash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // STRATEGY
        // alegere strategie la runtime
        // interfata cu metoda generica + clasele cu strategiile specifice
        // manager cu instanta de tip interfata, setter si metoda cu apel strategie specifica
        System.out.println("STRATEGY");

        ManagerPlata managerPlata=new ManagerPlata();
        managerPlata.alegePlata(new PlataCard());
        managerPlata.plateste();

        managerPlata.alegePlata(new PlataCash());
        managerPlata.plateste();

        // STATE
        // schimba comportament in functie de starile obiectului
        // interfata stare cu metoda schimbaStare(ctx) + cls stari concrete cu afisare si setStare(this)
        // cls care trece prin stari cu get pe atrib basic, instanta de stareAbstracta cu setter,
        // constructor care pune starea initiala, metode care creeaza stari noi si schimba stare obiect crt
        System.out.println("\nSTATE");

        Spital.State.Pacient pacientInternat=new Spital.State.Pacient("Alex", true);
        pacientInternat.puneSubObservatie();
        pacientInternat.externeaza();

        // OBSERVER
        // emite notificari catre persoanele abonate, anunta schimbarea starii unor obiecte
        // interfata + clsConcreta observer cu receptionare mesaj
        // interfata subject cu adauga, sterge si notifica observeri
        // + cls concreta subject cu lista observeri si diverse tipuri de notificari
        System.out.println("\nOBSERVER");

        IPacient pacientAbonat1=new PacientAbonat("Alex");
        IPacient pacientAbonat2=new PacientAbonat("Maria");

        Urgenta urgenta=new Urgenta();
        urgenta.adaugaPacient(pacientAbonat1);
        urgenta.adaugaPacient(pacientAbonat2);

        urgenta.alerteazaVirusNou();

        // MEMENTO
        // salveaza si revine la stari anterioare, pentru atribute care se modifica des
        // clasa care trebuie salvata, cu setter pe atributele care se modifica des + save&restore pe acele atribute cu memento
        // memento cu atrib care trb salvate, constructor cu param (VEZI ALOCARE MEMORIE) si getter
        // manager memento cu hashmap/list - cu add&getMemento
        System.out.println("\nMEMENTO");

        Pacient pacient=new Pacient("Diana", List.of("raceala","gripa"));
        pacient.afisarePacient();

        IstoricMedical istoricMedical=new IstoricMedical();
        istoricMedical.adaugaMemento(pacient.salvareIstoric(), "10/10/2023");

        pacient.setBoli("covid");
        pacient.afisarePacient();

        pacient.restaurareIstoric(istoricMedical.getMemento("10/10/2023"));
        pacient.afisarePacient();

    }
}