package Composite;


import java.util.ArrayList;
import java.util.List;

public class Panel  implements Component, Composite{
    List<Component> componente=new ArrayList<>();

    @Override
    public void render() {
        System.out.println("Panel");
        for(Component c:componente){
            c.render();
        }
    }

    @Override
    public void stergeComponenta(Component c) {
        componente.remove(c);
    }

    @Override
    public void adaugaComponenta(Component c) {
        componente.add(c);
    }

}
