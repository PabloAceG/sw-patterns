/**
 * Sample class that makes use of the elements from the abstract factory, to
 * create different objects depending on runtime.
 */
package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

/**
 * Theoretical application containing elements that paints buttons and
 * checkboxes.
 */
public class Application {
    /** Element to press */
    private Button button;
    /** Element to "tick" in */
    private Checkbox checkbox;

    /** Constructor.
     *
     * <p>
     * Generates the application elements depending on the OS the app is
     * launched in.
     *
     * @param factory Factory type depending on OS.
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    /** Paint the elements for the specified GUIFactory type. */
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
