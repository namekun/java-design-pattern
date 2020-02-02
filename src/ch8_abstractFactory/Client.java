package ch8_abstractFactory;

public class Client {
    public static void main(String[] args) {
        String vendorName = "LG";
        VendorID vendorID;

        // 인자에 따라 LG 또는 Hyundai 팩토리를 생성
        if(vendorName.equalsIgnoreCase("LG")){
            vendorID = VendorID.LG;
        } else{
            vendorID = VendorID.Hyundai;
        }

        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);

        Door door = factory.createDoor();
        Motor motor  = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
