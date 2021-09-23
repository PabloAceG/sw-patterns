/**
 * Sample main class. Where abstract factory is used.
 */
import app.Application;
import factories.GUIFactory;
import factories.LinuxFactory;
import factories.WinFactory;

/** Main Object */
public class Main
{
    /** Configure the GUI depending on host OS. */
    private static Application configureAppGUI() {
        Application app;
        GUIFactory factory;

        // Select an OS Factory
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("linux")) {
            factory = new LinuxFactory();
        } else {
            factory = new WinFactory();
        }

        // Create the application
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureAppGUI();
        app.paint();
    }
}
