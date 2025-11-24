package patterns.bridge;

public abstract class EntertainmentDevice {
    public int deviceState;
    public int maxSetting;
    public int volumeLevel = 15;

    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void deviceFeedback(){
        if(deviceState > maxSetting || deviceState < 0){
            deviceState = 0;
        }
        System.out.println("On " + deviceState);
    }

    public void buttonSevenPressed(){
        System.out.println("Volume level at " + (++volumeLevel));
    }

    public void buttonEightPressed(){
        System.out.println("Volume level at " + (--volumeLevel));
    }



}
