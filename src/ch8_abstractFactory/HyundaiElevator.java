package ch8_abstractFactory;

public class HyundaiElevator extends ElevatorFactory {

    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }

    @Override
    public ElevatorFactory getInstance() {
        return null;
    }
}
