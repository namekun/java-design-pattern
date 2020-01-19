package ch1_strategyPattern;

public class AObj {

    Ainterface ainterface;

    public AObj(){
        ainterface = new AinterfaceImpl();
    }

    public void funcAA(){

        // 이 funcAA에 필요한 기능이 a 인터페이스에 있다면?
        // 다른 객체에게 기능을 빌려서 가져온다. -> delegate
        ainterface.funcA();
        ainterface.funcA();
    }
}
