/**
 * Implementation of concrete Concrete Product of type B from the Abstract
 * Factory implementation.
 *
 * <p>
 * ConcreteProductB1
 */
package checkboxes;

/**
 * Implementation of Concrete Object for Linux Checkbox.
 */
public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You can mark me as done/full/marked. Simple, right?");
    }
}
