package ch8_abstractFactory;

public class ElevatorFactoryFactory {
    public static ElevatorFactory getFactory(VendorID vendorID){
        ElevatorFactory factory = null;

        switch (vendorID){
            case LG:
                factory = new LGElevatorFactory().getInstance();
                break;
            case Hyundai:
                factory = new HyundaiElevator().getInstance();
                break;
        }
        return factory;
    }
}
