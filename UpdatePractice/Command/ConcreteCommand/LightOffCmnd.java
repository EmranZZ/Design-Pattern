package UpdatePractice.Command.ConcreteCommand;

import UpdatePractice.Command.Command;
import UpdatePractice.Command.Receiver.Light;

public class LightOffCmnd implements Command {
    Light light;

    public LightOffCmnd(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }
}
