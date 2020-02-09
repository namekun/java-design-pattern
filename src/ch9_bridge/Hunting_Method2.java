package ch9_bridge;

public class Hunting_Method2 implements Hunting_Handler {
    public void Find_Quarry() {
        System.out.println("땅 위에서 찾는다!");
    }

    public void Detected_Quarry() {
        System.out.println("먹잇감 발견!");
    }

    public void attack() {
        System.out.println("사냥 시작!");
    }
}
