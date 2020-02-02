package ch8_abstractFactory;

/* LG 부품을 생성하는 팩토리 클래스 */
public class LGElevatorFactory extends ElevatorFactory {
    private static ElevatorFactory factory;

    protected LGElevatorFactory() {
    }


    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }

    @Override
    public ElevatorFactory getInstance() {
        if(factory == null)
            factory = new LGElevatorFactory();

        return factory;
    }
}

