package ch6_command.example2;

import ch6_command.example1.Command;
import ch6_command.example1.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
