package ch11_state.step2;

public class Client_beforeState {
    public static void main(String[] args) {
        Light_beforeState light = new Light_beforeState();
        light.off_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.off_button_pushed();
    }
}
