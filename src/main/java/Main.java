import Controller.RemoteControllerWithObjects;
import Invokers.CeilingFanOffAndSpeedCommand;
import Invokers.CeilingFanOnAndSpeedCommand;
import Invokers.LightOffCommand;
import Invokers.LightOnCommand;
import Objects.CeilingFan;
import Objects.Light;

public class Main {
    public static void main(String []args) {
        Light light = new Light();
        CeilingFan ceilingFan = new CeilingFan();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        CeilingFanOnAndSpeedCommand ceilingFanOnAndSpeedCommand = new CeilingFanOnAndSpeedCommand(ceilingFan);
        CeilingFanOffAndSpeedCommand ceilingFanOffAndSpeedCommand = new CeilingFanOffAndSpeedCommand(ceilingFan);
        RemoteControllerWithObjects remoteControllerWithObjects = new RemoteControllerWithObjects();
        remoteControllerWithObjects.setRemoteControllerOn(3,lightOnCommand,lightOffCommand);
        remoteControllerWithObjects.setRemoteControllerOn(0,lightOnCommand,lightOffCommand);
        remoteControllerWithObjects.onButtonPushed(5);
        remoteControllerWithObjects.onButtonPushed(3);
        remoteControllerWithObjects.offButtonPushed(3);
    }
}
