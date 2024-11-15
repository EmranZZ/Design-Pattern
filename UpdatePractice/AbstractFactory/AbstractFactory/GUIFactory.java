package UpdatePractice.AbstractFactory.AbstractFactory;

import UpdatePractice.AbstractFactory.AbstractProduct.Button.Button;
import UpdatePractice.AbstractFactory.AbstractProduct.Checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
