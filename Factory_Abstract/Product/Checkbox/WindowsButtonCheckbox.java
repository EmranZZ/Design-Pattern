package Factory_Abstract.Product.Checkbox;

public class WindowsButtonCheckbox implements Checkbox {
    @Override
    public void show() {
        System.out.println("WindowsButton created");
    }
}
