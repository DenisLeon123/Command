import dleon.SimpleRemoteControl;
import dleon.garageDoor.GarageDoor;
import dleon.garageDoor.GarageDoorCommand;
import dleon.light.Light;
import dleon.light.LightOnCommand;
import dleon.stereo.Stereo;
import dleon.stereo.StereoCommand;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        GarageDoorCommand gdc = new GarageDoorCommand(new GarageDoor());
        StereoCommand stereoCommand = new StereoCommand(new Stereo());

        simpleRemoteControl.setCommand(() -> gdc.open());
        simpleRemoteControl.setCommand(() -> gdc.close());

        simpleRemoteControl.setCommand(() -> stereoCommand.on());
        simpleRemoteControl.setCommand(() -> stereoCommand.off());
        simpleRemoteControl.buttonWasPressed();
    }
}
