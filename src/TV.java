public class TV implements Device {
    private boolean on = false;
    private int volume = 10;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is now OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV's volume set to " + volume);
    }
}
