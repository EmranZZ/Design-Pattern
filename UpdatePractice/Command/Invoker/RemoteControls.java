package UpdatePractice.Command.Invoker;

import UpdatePractice.Command.Command;

public class RemoteControls {
    Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void button(){
        command.execute();
    }
}
