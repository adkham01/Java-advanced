package patterns.bridge;


public class DVDRemote extends EntertainmentDevice {

    public DVDRemote(int deviceState, int maxSetting) {
        this.deviceState = deviceState;
        this.maxSetting = maxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("DVD is Playing");
    }

    @Override
    public void buttonSixPressed() {
        System.out.println( "DVD is Paused");
    }
}
