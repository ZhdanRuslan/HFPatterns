package ch6_command.example2;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Stereo livingRoomStereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(livingRoomStereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(livingRoomStereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffWithCDCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }
}
