package Invokers;

import Controller.RemoteController;
import Objects.Light;

public class LightOffCommand implements RemoteController {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnLightOff();
    }
}
