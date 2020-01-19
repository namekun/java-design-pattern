package ch2_Adapter;

public class Main {
    public static void main(String[] args) {

        // 요구사항을 수정하는 인스턴스
        Adapter adapter = new AdapterImpl();

        System.out.println( adapter.twiceOf(100f));
        System.out.println( adapter.halfOf(100f));
    }
}
