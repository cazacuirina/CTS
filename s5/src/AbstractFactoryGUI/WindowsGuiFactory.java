package AbstractFactoryGUI;

public class WindowsGuiFactory implements GuiFactory{
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Menu getMenu() {
        return new WindowsMenu();
    }
}
