package ch2_Adapter;

public class AdapterImpl implements Adapter{

    @Override
    public Float twiceOf(Float f) {

        // 기존에는 이런식으로 float 형태로 변경해야하는 logic 이 필요하게 됩니다.
        return  Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("절반 함수 호출");
        return (float) Math.half(f.doubleValue());
    }
}
