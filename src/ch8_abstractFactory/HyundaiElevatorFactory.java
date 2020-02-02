package ch8_abstractFactory;

/* LG 부품을 생성하는 팩토리 클래스 */
public class HyundaiElevatorFactory extends ElevatorFactory {
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
