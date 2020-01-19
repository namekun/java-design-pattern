package ch1_strategyPattern;

public class MainClass {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        // interface는 funcA를 사용할 수 있도록 하는 통로가 되어줍니다.
//        ainterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();
    }
}
