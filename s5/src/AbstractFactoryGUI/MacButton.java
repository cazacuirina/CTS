package AbstractFactoryGUI;

public class MacButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Mac Button");
    }
}
