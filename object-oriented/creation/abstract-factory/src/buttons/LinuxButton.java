package buttons;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is a button for the Linux application, much better that Windows...");
    }
}
