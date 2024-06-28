package Factory_Abstract.Product.Button;

public class MacOSButton implements Button {
    @Override
    public void show() {
        System.out.println("MacOSButton created");
    }
}
