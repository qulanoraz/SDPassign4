public class AdvancedRemote extends RemoteControl{
    public AdvancedRemote(Device device){
        super(device);
    }

    @Override
    public void turnOn(){
        device.turnOn();
    }

    @Override
    public void turnOff(){
        device.turnOff();
    }

    @Override
    public void setVolume(int volume){
        device.setVolume(volume);
    }

    public void mute(){
        device.setVolume(0);
        System.out.println("Device was muted");
    }
}
