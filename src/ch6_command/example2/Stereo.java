package ch6_command.example2;

public class Stereo {

    private int volume;
    private String title;

    public Stereo(String s) {
        title = s;
    }

    public void on(){
        System.out.println("ON in " + title);
    }

    public void off(){
        System.out.println("OFF in " + title);
    }

    public void setCd(){
        System.out.println("CD was chosen. In " + title);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume level is setting on :" + volume + " in " + title);
    }
}
