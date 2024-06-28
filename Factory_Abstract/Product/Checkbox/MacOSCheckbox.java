package Factory_Abstract.Product.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void show() {
        System.out.println("MacOSButton created");
    }
}
