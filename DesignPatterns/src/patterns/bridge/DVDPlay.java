package patterns.bridge;

public class DVDPlay extends RemoteButton{
    public DVDPlay(EntertainmentDevice device) {
        System.out.println("DVDPlay");
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("DVD is Playing");
    }
}
