package patterns.command;

public class VolumeDownTV implements Command{
    private final ElectronicDevice device;

    public VolumeDownTV(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void unexecute() {
        device.volumeUp();
    }
}
