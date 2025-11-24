package patterns.command;

public class TVRemote {
    public ElectronicDevice getDevice() {
        return new Television();
    }
}
