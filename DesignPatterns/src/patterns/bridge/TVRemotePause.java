package patterns.bridge;

public class TVRemotePause extends RemoteButton{
    public TVRemotePause(EntertainmentDevice device) {
        System.out.println("TVRemotePause");
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV is Paused");
    }
}
