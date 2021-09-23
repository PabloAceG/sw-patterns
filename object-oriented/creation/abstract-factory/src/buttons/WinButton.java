/**
 * Implementation of concrete Concrete Product of type A from the Abstract
 * Factory implementation.
 *
 * <p>
 * ConcreteProductA2
 */
package buttons;

/**
 * Implementation of Concrete Object for Windows Button.
 */
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("I'm a Windows button. I work... sometimes...");
    }
}
