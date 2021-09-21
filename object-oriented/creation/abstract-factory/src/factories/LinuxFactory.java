package factories;

import buttons.Button;
import buttons.LinuxButton;
import checkboxes.Checkbox;
import checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

}
