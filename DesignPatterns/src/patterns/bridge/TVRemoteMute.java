package patterns.bridge;

public class TVRemoteMute extends RemoteButton{
    public TVRemoteMute(EntertainmentDevice device) {
        System.out.println("TVRemoteMute");
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV is Muted");
    }
}
