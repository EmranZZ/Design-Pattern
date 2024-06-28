package Factory_Abstract.Abstract_Factory;

import Factory_Abstract.Product.Button.Button;
import Factory_Abstract.Product.Checkbox.Checkbox;

public interface GUIfactory {
    Button createButton();
    Checkbox createCheckbox();
}
