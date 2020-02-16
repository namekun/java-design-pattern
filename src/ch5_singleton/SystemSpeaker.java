package ch5_singleton;

public class SystemSpeaker {

    static private SystemSpeaker instance;

    private  int Volumne;

    private SystemSpeaker() {
        Volumne = 5; // initialize
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            instance = new SystemSpeaker(); // initialize
            System.out.println("log 생성");
        }else{
            System.out.println("log 이미 생성");
        }
        return instance;
    }

    public int getVolumne() {
        return Volumne;
    }

    public void setVolumne(int volumne) {
        Volumne = volumne;
    }
}
