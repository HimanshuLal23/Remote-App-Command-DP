package Invokers;

import Controller.RemoteController;
import Objects.CeilingFan;

public class CeilingFanOnAndSpeedCommand implements RemoteController {
    private CeilingFan ceilingFan;
    public CeilingFanOnAndSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.startFan();
    }
}
