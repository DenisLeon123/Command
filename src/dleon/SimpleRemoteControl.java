package dleon;

import dleon.command.Command;

import java.util.ArrayList;

public class SimpleRemoteControl {
    ArrayList<Command> slot = new ArrayList<>();

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        this.slot.add(command);
    }

    public void buttonWasPressed(){
        for(Command command:slot) {
            command.execute();
        }
    }
}
