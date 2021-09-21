/**
 * This is the implementation of the common interface of an Abstract Factory
 * implementation. It does not count with specified implementations as its
 * purpose is that of an example, not a real-world implementation.
 */
package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * Common interface for GUIs implementations.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
