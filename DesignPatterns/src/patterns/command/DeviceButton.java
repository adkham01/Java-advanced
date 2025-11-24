package patterns.command;

public class DeviceButton {
    private final Command command;
    public DeviceButton(Command command) {
        this.command = command;
    }

    void press() {
        command.execute();
    }

    void undo(){
        command.unexecute();
    }
}
