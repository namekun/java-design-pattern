package ch5_singleton;

public class Main {
    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println(speaker1.getVolumne());
        System.out.println(speaker2.getVolumne());

        speaker1.setVolumne(1);
        // 동일한 인스턴스 값이기에 하나만 설정해도 같은 값을 가져온다.
        System.out.println(speaker1.getVolumne());
        System.out.println(speaker2.getVolumne());

        speaker2.setVolumne(30);
        System.out.println(speaker1.getVolumne());
        System.out.println(speaker2.getVolumne());
    }
}
