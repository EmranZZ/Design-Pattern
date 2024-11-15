package UpdatePractice.AbstractFactory;

import UpdatePractice.AbstractFactory.AbstractFactory.GUIFactory;
import UpdatePractice.AbstractFactory.AbstractProduct.Button.Button;
import UpdatePractice.AbstractFactory.AbstractProduct.Checkbox.Checkbox;
import UpdatePractice.AbstractFactory.ConcreteFactory.MacFactory;
import UpdatePractice.AbstractFactory.ConcreteFactory.WindowsFactory;

public class client {
    private Button button;
    private Checkbox checkbox;

    public client(GUIFactory GUIfactory){
        button = GUIfactory.createButton();
        checkbox = GUIfactory.createCheckbox();
    }

    public void show(){
        button.show();
        checkbox.show();
    }

    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();

        client c1 = new client(windowsFactory);
        c1.show();

        GUIFactory macFactory = new MacFactory();

        client c2 = new client(macFactory);
        c2.show();
    }
}
