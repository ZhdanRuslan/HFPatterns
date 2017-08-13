package ch6_command.example2;

public class Light {

    private String title;

    public Light(String s) {
        title = s;
    }

    public void on() {
        System.out.println("ON in " + title);
    }

    public void off() {
        System.out.println("OFF in " + title);
    }
}