package patterns.command;

public class Radio implements ElectronicDevice {
    private int volume;

    public Radio() {
        volume = 15;
    }

    @Override
    public void on() {
        System.out.println("Radio is on");
    }
    @Override
    public void off() {
        System.out.println("Radio is off");
    }
    @Override
    public void volumeUp() {
        System.out.println("Radio volume at " +(++volume));
    }
    @Override
    public void volumeDown() {
        System.out.println("Radio volume at " +(--volume));
    }
}
