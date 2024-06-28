package Factory_Abstract.Product.Button;

public class WindowsButton implements Button {
    @Override
    public void show() {
        System.out.println("WindowsButton created");
    }
}
