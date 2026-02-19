package clean.code.practice_2.task_6;

public class MacOSGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Window createWindow() {
        return new MacOSWindow();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}
