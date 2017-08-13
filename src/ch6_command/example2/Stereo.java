package ch6_command.example2;

public class Stereo {

    private int volume;

    public void on(){
        System.out.println("ON");
    }

    public void off(){
        System.out.println("OFF");
    }

    public void setCd(){
        System.out.println("CD was chosen.");
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume level is setting on :" + volume);
    }
}
