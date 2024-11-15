package UpdatePractice.AbstractFactory.ConcreteFactory;

import UpdatePractice.AbstractFactory.AbstractFactory.GUIFactory;
import UpdatePractice.AbstractFactory.AbstractProduct.Button.Button;
import UpdatePractice.AbstractFactory.AbstractProduct.Button.WindowsButton;
import UpdatePractice.AbstractFactory.AbstractProduct.Checkbox.Checkbox;
import UpdatePractice.AbstractFactory.AbstractProduct.Checkbox.WindowsChk;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsChk();
    }
}
