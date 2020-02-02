package ch8_abstractFactory;

public abstract class Door {
    private int doorStatus;

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public int getDoorStatus() {
        return doorStatus;
    }

    // primitive  or hook method
    protected abstract void doClose();

    // template method : close door
    public void close() {
        // if door is already closed, do nothing
        if (doorStatus == DoorStatus.CLOSED) {
            return;
        }
        // primitive or hook method, Override from under class
        doClose(); // close the door
        doorStatus = DoorStatus.CLOSED; // record door status closed.
    }

    // primitive or hook method
    protected abstract void doOpen();

    // template method : open door
    public void open() {
        // if already door opened, do nothing
        if (doorStatus == DoorStatus.OPENED) {
            return;
        }
        doOpen(); // open the door
        doorStatus = DoorStatus.OPENED; // record door status opened
    }
}
