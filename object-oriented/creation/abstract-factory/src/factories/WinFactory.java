package factories;

import buttons.Button;
import buttons.WinButton;
import checkboxes.Checkbox;
import checkboxes.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }

}
