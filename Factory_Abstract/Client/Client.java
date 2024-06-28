package Factory_Abstract.Client;

import Factory_Abstract.Abstract_Factory.GUIfactory;
import Factory_Abstract.ConcreteFactory.MacOSFactory;
import Factory_Abstract.ConcreteFactory.WindowsFactory;

public class Client {
    public static CreateApp ConfApp(){
        CreateApp app;
        GUIfactory factory;

        String osName = System.getProperty("os.name").toUpperCase();

        if(osName.contains("WINDOWS") ) {
            factory = new WindowsFactory();
        }
        else {
            factory = new MacOSFactory();
        }

        app = new CreateApp(factory);
        return app;
    }

    public static void main(String[] args) {
        CreateApp app = ConfApp();
        app.show();
    }
}
