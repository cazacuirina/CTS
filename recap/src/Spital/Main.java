package Spital;

import Spital.Builder.*;
import Spital.FactoryMethod.AsistentFactory;
import Spital.FactoryMethod.BrancardierFactory;
import Spital.FactoryMethod.MedicFactory;
import Spital.FactorySimple.Factory;
import Spital.FactorySimple.Personal;
import Spital.FactorySimple.TipPersonal;
import Spital.Prototype.RecordReteta;
import Spital.Prototype.Reteta;
import Spital.Singleton.ServerSpital;

import java.io.Serial;
import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*SINGLETON: Spitalul implementeaza un sistem centralizat de monitorizare a pacientilor. Sistemul trebuie sa asigure
        adaugarea & modificarea datelor despre pacienti intr-un mediu securizat. Sa se asigure ca sistemul nu va putea fi replicat si ca toate datele
        vor fi manageriate printr-un server unic.
         */
        System.out.println("SINGLETON");

        ServerSpital serverSpital=ServerSpital.getInstance(8080, "Sp. Universitar");
        serverSpital.descrie();

        /*BUILDER: Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare pacient
        are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic dejun inclus,
        papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste facilitați extra,
        in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea de obiecte de
        tipul pacient cu opțiuni extra.
        */
        System.out.println("BUILDER");

        IBuilder builder=new BuilderPacient();
        Secretar secretar=new Secretar(builder);
        secretar.buildPacient("Ioana", "covid", true, false, false, true);
        Pacient pacientPremium=secretar.getPacientCreat();
        pacientPremium.descrie();


        /*SIMPLE FACTORY: În cadrul aplicației personalul spitalului este de mai multe tipuri. Acestea sunt salvate într-un
        enum { Brancardier, Asistent, Medic}. Să se implementeze modulul care pune la dispoziției
        crearea de obiecte din familia obiectelor PersonalSpital in funcție de tipul primit ca parametru.
        */
        System.out.println("SIMPLE FACTORY");

        Factory factory=new Factory();

        List<Personal> personalList=new ArrayList<Personal>();
        personalList.add(factory.createPersonal(TipPersonal.Asistent));
        personalList.add(factory.createPersonal(TipPersonal.Medic));
        personalList.add(factory.createPersonal(TipPersonal.Brancardier));

        for(Personal p: personalList){
            p.descrie();
        }


        /*FACTORY METHOD: În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.
        Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor
        PersonalSpital. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de personal să
        nu fie necesare modificări în codul existent.*/
        System.out.println("FACTORY METHOD");

        AsistentFactory asistentFactory=new AsistentFactory();
        MedicFactory medicFactory=new MedicFactory();
        BrancardierFactory brancardierFactory=new BrancardierFactory();

        List<Spital.FactoryMethod.Personal>personalList2=new ArrayList<Spital.FactoryMethod.Personal>();
        personalList2.add(asistentFactory.createPersonal());
        personalList2.add(medicFactory.createPersonal());
        personalList2.add(brancardierFactory.createPersonal());

        for(Spital.FactoryMethod.Personal p: personalList2){
            p.descrie();
        }


        /*PROTOTYPE: Spitalul are în dotare și un laborator în care mai mulți chimiști produc diferite rețete pentru
        medicamente. În momentul în care o rețetă este produsă trebuie ținut cont de cantitățile din soluțiile
        care sunt folosite. Dacă o rețetă este creată este recomandat să fie folosită pentru crearea viitoarelor
        medicamente fără a se trece prin procesul de creare al rețetei. Să se implementeze modulul care
        facilitează crearea de noi obiecte de rețete fără a fi nevoie de apelul constructorului*/
        System.out.println("PROTOTYPE");

        RecordReteta recordReteta=new RecordReteta();
        Reteta retetaNurofen=recordReteta.genereazaReteta("Nurofen", "Ibuprofen", 200);
        Reteta retetaParacetamol=recordReteta.genereazaReteta("Panadol", "Paracetamol", 100);

    }
}