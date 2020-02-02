package ch8_abstractFactory;

public class Motor {
    private MotorStatus motorStatus;
    private Door door;

    public void setDoor(Door door){
        this.door = door;
    }

    public void move(Direction direction){
        this.door.doClose();
        this.moveMotor(direction);
    }

    protected void moveMotor(Direction direction){}
}
