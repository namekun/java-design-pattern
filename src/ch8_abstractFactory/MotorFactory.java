package ch8_abstractFactory;

public class MotorFactory {
    // vendorID에 따라서 LGMotor 또는 HyundaiMotor 객체를 생성
    public static Motor createMotor(VendorID vendorID){
        Motor motor = null;

        switch (vendorID){
            case LG:
                motor = new LGMotor();
                break;
            case Hyundai:
                motor = new HyundaiMotor();
                break;
        }
        return motor;
    }
}
