package Objects;

public class CeilingFan {
    private int HIGH = 3;
    private int MEDIUM = 2;
    private int LOW = 3;

    public void startFan() {
        System.out.println("Fan started at "+ HIGH);
    }

    public void stopFan() {
        System.out.println("Fan stopped");
    }
}
