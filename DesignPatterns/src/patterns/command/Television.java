package patterns.command;

public class Television implements ElectronicDevice {
    private int volume;

    public Television() {
        volume = 15;
    }

    @Override
    public void on() {
        System.out.println("Television is on");
    }
    @Override
    public void off() {
        System.out.println("Television is off");
    }
    @Override
    public void volumeUp() {
        System.out.println("Television volume at " +(++volume));
    }
    @Override
    public void volumeDown() {
        System.out.println("Television volume at " +(--volume));
    }
}
