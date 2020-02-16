package ch11_state.step2;

/*
 * state 패턴을 적용하기 전의 코드
 */
public class Light_beforeState {
    // 형광등 상태를 표현하는 상수
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEPING = 2;

    private int state;

    public Light_beforeState() {
        state = OFF; // 형광등 초기 상태는 꺼져있음
    }

    public void on_button_pushed() {
        if (state == ON) {
            System.out.println("취침등");
            state = SLEEPING;
        } else if (state == SLEEPING) {
            System.out.println("light on!"); // 전구가 꺼져있으면 반응
            state = ON;
        } else {
            System.out.println("light on!");
            state = ON;
        }
    }

    public void off_button_pushed() {
        if (state == OFF) {
            System.out.println("반응 없음");
        } else if (state == SLEEPING) {
            System.out.println("Light off");
            state = OFF;
        } else {
            System.out.println("light off!");
            state = OFF;
        }
    }
}

