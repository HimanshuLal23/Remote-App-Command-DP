package Invokers;

import Controller.RemoteController;
import Objects.Light;

import javax.swing.text.Utilities;

public class LightOnCommand implements RemoteController {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnLightOn();
    }
}
