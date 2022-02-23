package dleon.light;

public class LightOnCommand{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void on(){
        light.on();
    }

    public void off(){
        light.off();
    }
}
