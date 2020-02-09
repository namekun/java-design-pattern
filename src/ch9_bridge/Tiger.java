package ch9_bridge;

public class Tiger extends Animal {
    public Tiger(Hunting_Handler hunt) {
        super(hunt);
    }

    public void hunt(){
        System.out.println("호랑이가 사냥한다 어흥");
        Find_Quarry();
        Detected_Quarry();
        Attack();
    }
}
