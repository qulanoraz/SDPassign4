public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemote(tv);

        basicRemote.turnOn();
        basicRemote.setVolume(25);
        basicRemote.turnOff();

        System.out.println("-------------");

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        advancedRemote.turnOn();
        advancedRemote.setVolume(50);
        advancedRemote.mute();
        advancedRemote.turnOff();
    }
}
