package patterns.bridge;

public class TestTheRemote {
    static void main() {
        RemoteButton tv1 = new TVRemoteMute(new TVDevice(7, 100));
        RemoteButton tv2 = new TVRemotePause(new TVDevice(7, 100));
        RemoteButton dvd = new DVDPlay(new DVDRemote(1, 14));

        tv1.buttonNinePressed();
        tv2.buttonNinePressed();
        dvd.buttonNinePressed();
    }
}
