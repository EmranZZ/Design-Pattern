package Factory_Abstract.Client;

import Factory_Abstract.Abstract_Factory.GUIfactory;
import Factory_Abstract.Product.Button.Button;
import Factory_Abstract.Product.Checkbox.Checkbox;

public class CreateApp {
    private Button button;
    private Checkbox checkbox;

    public CreateApp(GUIfactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void show(){
        button.show();
        checkbox.show();
    }
}
