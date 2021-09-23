/**
 * This is the implementation of the common interface of an Abstract Factory
 * implementation.
 */
package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * Common interface for GUIs implementations.
 */
public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
