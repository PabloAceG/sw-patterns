/**
 * One concrete implementation of the object. This sample creates a button for
 * Linux OS.
 */
package factories;

import buttons.Button;
import buttons.WinButton;
import checkboxes.Checkbox;
import checkboxes.WinCheckbox;

/** Windows application elements. */
public class WinFactory implements GUIFactory {
    /**
     * Creates a Windows button.
     *
     * @return Windows button.
     */
    @Override
    public Button createButton() {
        return new WinButton();
    }

    /**
     * Creates Windows checkbox.
     *
     * @return Windows checkbox.
     */
    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }

}
