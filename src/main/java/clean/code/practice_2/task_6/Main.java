package clean.code.practice_2.task_6;

public class Main {
    public static void main(String[] args) {

        GUIFactory guiFactory;

        String systemName = "Windows";

        if ("MacOS".equalsIgnoreCase(systemName)) {
            guiFactory = new MacOSGUIFactory();
        } else {
            guiFactory = new WindowsGUIFactory();
        }

        guiFactory.createButton().pushButton();
        guiFactory.createMenu().launchMenu();
        guiFactory.createWindow().openWindow();
    }
}
