package ch9_bridge;

public class Bird extends Animal {
    public Bird(Hunting_Handler hunt) {
        super(hunt);
    }
    public void hunt(){
        System.out.println("새가 사냥한다 짹짹");
        Find_Quarry();
        Detected_Quarry();
        Attack();
    }
}
