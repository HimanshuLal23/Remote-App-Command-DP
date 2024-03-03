package Invokers;

import Controller.RemoteController;
import Objects.CeilingFan;

public class CeilingFanOffAndSpeedCommand implements RemoteController {
    private CeilingFan ceilingFan;
    public CeilingFanOffAndSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.stopFan();
    }
}
