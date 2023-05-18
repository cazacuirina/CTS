package AbstractFactoryGUI;

public class WindowsButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Windows Button");
    }
}