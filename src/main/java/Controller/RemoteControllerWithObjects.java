package Controller;

public class RemoteControllerWithObjects {
    private RemoteController remoteControllerOns[];
    private RemoteController remoteControllerOffs[];
    public RemoteControllerWithObjects() {
        remoteControllerOns = new RemoteController[7];
        remoteControllerOffs = new RemoteController[7];
        for(int i=0;i<7;i++) {
            remoteControllerOns[i] = null;
            remoteControllerOffs[i] = null;
        }
    }
    public void setRemoteControllerOn(int slot,RemoteController remoteControllerOn,RemoteController remoteControllerOff) {
        remoteControllerOns[slot] = remoteControllerOn;
        remoteControllerOffs[slot] = remoteControllerOff;
    }

    public void onButtonPushed(int slot) {
        try {
            remoteControllerOns[slot].execute();
        }catch (IndexOutOfBoundsException exception) {
            printIndexOutOfBoundsExceptionMessage(slot);
        }catch (NullPointerException exception) {
            printNullPointerExceptionMessage(slot);
        }
    }

    public void offButtonPushed(int slot) {
        try {
            remoteControllerOffs[slot].execute();
        }catch (IndexOutOfBoundsException exception) {
            printIndexOutOfBoundsExceptionMessage(slot);
        }catch (NullPointerException exception) {
            printNullPointerExceptionMessage(slot);
        }
    }

    private void printIndexOutOfBoundsExceptionMessage(int index) {
        System.out.println("Index " + index +" out of bound exception");
    }

    private void printNullPointerExceptionMessage(int slot) {
        System.out.println("Slot " + slot + " is null");
    }
}
