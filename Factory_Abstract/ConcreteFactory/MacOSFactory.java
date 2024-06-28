package Factory_Abstract.ConcreteFactory;

import Factory_Abstract.Abstract_Factory.GUIfactory;
import Factory_Abstract.Product.Button.Button;
import Factory_Abstract.Product.Button.MacOSButton;
import Factory_Abstract.Product.Checkbox.Checkbox;
import Factory_Abstract.Product.Checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIfactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
