package patterns.command;

public class VolumeUpTV implements Command{
    private final ElectronicDevice device;

    public VolumeUpTV(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }
    @Override
    public void unexecute() {
        device.volumeDown();
    }
}
