package ch8_abstractFactory;

public class HyundaiDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("lotte door close");
    }

    @Override
    protected void doOpen() {
        System.out.println("lotte door open");
    }
}
