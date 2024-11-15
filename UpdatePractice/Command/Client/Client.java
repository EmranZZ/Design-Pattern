package UpdatePractice.Command.Client;

import UpdatePractice.Command.ConcreteCommand.LightOffCmnd;
import UpdatePractice.Command.ConcreteCommand.LightOnCmnd;
import UpdatePractice.Command.Invoker.RemoteControls;
import UpdatePractice.Command.Receiver.Light;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();

        LightOffCmnd lightOff = new LightOffCmnd(light);
        LightOnCmnd lightOn = new LightOnCmnd(light);

        RemoteControls remote = new RemoteControls();

        remote.setCommand(lightOff);
        remote.button();

        remote.setCommand(lightOn);
        remote.button();

    }
}
