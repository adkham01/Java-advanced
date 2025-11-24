package patterns.command;

import java.util.List;

public class PlayWithRemote {
    static void main() {
        TVRemote remote = new TVRemote();
        ElectronicDevice device = remote.getDevice();
        DeviceButton turnOnButtonTv = new DeviceButton(new TurnTVOn(device));
        DeviceButton turnOffButtonTv = new DeviceButton(new TurnTVOf(device));
        DeviceButton volumeUpButtonTv = new DeviceButton(new VolumeUpTV(device));
        DeviceButton volumeDownButtonTv = new DeviceButton(new VolumeDownTV(device));
        turnOnButtonTv.press();
        volumeUpButtonTv.press();
        volumeDownButtonTv.press();
        turnOffButtonTv.press();

        ElectronicDevice radio = new Radio();
        radio.on();
        radio.volumeUp();
        radio.volumeDown();
        List<ElectronicDevice> devices = List.of(device, radio);
        TurnAllOff turnAllOff = new TurnAllOff(devices);
        DeviceButton turnOffButton = new DeviceButton(turnAllOff);
        turnOffButton.press();
        turnOffButton.undo();
    }
}
