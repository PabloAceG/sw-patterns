/**
 * One concrete implementation of the object. This sample creates a elements for
 * Linux OS.
 */
 package factories;

import buttons.Button;
import buttons.LinuxButton;
import checkboxes.Checkbox;
import checkboxes.LinuxCheckbox;

/** Linux application elements. */
public class LinuxFactory implements GUIFactory {
    /**
     * Creates a Linux button.
     *
     * @return Linux button.
     */
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    /**
     * Creates Linux checkbox.
     *
     * @return Linux checkbox.
     */
    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

}
