package dleon.garageDoor;

public class GarageDoorCommand{
    private GarageDoor garageDoor;

    public GarageDoorCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    public void open(){
        garageDoor.open();
    }

    public void close(){
        garageDoor.close();
    }
}
