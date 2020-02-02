package ch8_abstractFactory;

/**
 * 추상 부품을 생성하는 추상 팩토리 클래스
 */
public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();

    public abstract ElevatorFactory getInstance();
}
