package Factory_Abstract.ConcreteFactory;

import Factory_Abstract.Abstract_Factory.GUIfactory;
import Factory_Abstract.Product.Button.Button;
import Factory_Abstract.Product.Button.WindowsButton;
import Factory_Abstract.Product.Checkbox.Checkbox;
import Factory_Abstract.Product.Checkbox.WindowsButtonCheckbox;

public class WindowsFactory implements GUIfactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsButtonCheckbox();
    }
}
