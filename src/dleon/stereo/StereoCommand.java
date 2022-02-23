package dleon.stereo;

import dleon.command.Command;

public class StereoCommand{
    private Stereo stereo;

    public StereoCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void on(){
        stereo.on();
    }

    public void off(){
        stereo.off();
    }
}
