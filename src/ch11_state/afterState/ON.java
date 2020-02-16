package ch11_state.afterState;

public class ON implements State{
    private static ON on = new ON(); // ON 클래스의 인스턴스로 초기화
    private ON(){}

    protected static ON getInstance(){ // 초기화된 ON 클래스의 인스턴스를 반환
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void off_button_pushed(Light light) {
        light.setState(OFF.getInstance());
        System.out.println("Light Off");
    }
}
