import Composite.*;

public class Main {
    public static void main(String[] args) {
        // COMPOSITE - structura ierarhica
        // noduri frunze (button, textfield) + noduri compuse (panel)
        // metodele de adaugare si stergere noduri sunt puse in nodurile compuse aici, nu in interfata ca la curs (unde la frunze arncam exceptii!)
        // nu trebuie sa implementam metode inutile

        Component button1=new Button();
        Component button2=new Button();
        Component textField=new TextField();

        Panel panel=new Panel();
        panel.adaugaComponenta(button1);
        panel.adaugaComponenta(button2);
        panel.adaugaComponenta(textField);

        panel.stergeComponenta(button2);

        panel.render();



    }
}