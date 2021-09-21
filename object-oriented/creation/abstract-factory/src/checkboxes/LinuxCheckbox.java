package checkboxes;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You can mark me as done/full/marked. Simple, right?");
    }
}
