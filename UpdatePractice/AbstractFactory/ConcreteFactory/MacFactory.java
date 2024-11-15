package UpdatePractice.AbstractFactory.ConcreteFactory;

import UpdatePractice.AbstractFactory.AbstractFactory.GUIFactory;
import UpdatePractice.AbstractFactory.AbstractProduct.Button.Button;
import UpdatePractice.AbstractFactory.AbstractProduct.Button.MacButton;
import UpdatePractice.AbstractFactory.AbstractProduct.Checkbox.Checkbox;
import UpdatePractice.AbstractFactory.AbstractProduct.Checkbox.MacChk;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacChk();
    }
}
