package patterns.command;

import java.util.List;

public class TurnAllOff implements Command{

    private final List<ElectronicDevice> devices;

    public TurnAllOff(List<ElectronicDevice> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        System.out.println("Turning all off");
        for (ElectronicDevice device : devices) {
            device.off();
        }
    }

    @Override
    public void unexecute() {
        System.out.println("Turning all on");
        for (ElectronicDevice device : devices) {
            device.on();
        }
    }
}
