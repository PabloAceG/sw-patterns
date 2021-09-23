/**
 * Implementation of concrete Concrete Product of type A from the Abstract
 * Factory implementation.
 *
 * <p>
 * ConcreteProductA1
 */
package buttons;

/**
 * Implementation of Concrete Object for Linux Button.
 */
public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is a button for the Linux application, much better that Windows...");
    }
}
