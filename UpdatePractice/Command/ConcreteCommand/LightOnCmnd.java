package UpdatePractice.Command.ConcreteCommand;

import UpdatePractice.Command.Command;
import UpdatePractice.Command.Receiver.Light;

public class LightOnCmnd implements Command {
    Light light;

    public LightOnCmnd(Light light){
        this.light=light;
    }
    public void execute(){
        light.turnOn();
    }

}
