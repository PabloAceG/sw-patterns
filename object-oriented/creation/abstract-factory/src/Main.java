import app.Application;
import factories.GUIFactory;
import factories.LinuxFactory;
import factories.WinFactory;

public class Main
{
    private static Application configureAppGUI() {
        Application app;
        GUIFactory factory;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("linux")) {
            factory = new LinuxFactory();
        } else {
            factory = new WinFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureAppGUI();
        app.paint();
    }
}
