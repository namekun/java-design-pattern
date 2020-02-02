package ch8_abstractFactory;

public class LGMotor extends Motor {
    @Override
    public void moveMotor(Direction direction) {
        System.out.println("move LG Motor");
    }
}
