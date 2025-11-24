package patterns.command;

public class TurnTVOf implements Command{
    private final ElectronicDevice device;

    public TurnTVOf(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void unexecute() {
        device.on();
    }
}
