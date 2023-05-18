package AbstractFactoryGUI;

public class MacGuiFactory implements GuiFactory{
    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Menu getMenu() {
        return new MacMenu();
    }
}
