package checkboxes;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
       System.out.print("So... I am box that is empty. If you click me, I get ");
       System.out.println("a tick symbol inside. That means you have marked me");
    }
}
