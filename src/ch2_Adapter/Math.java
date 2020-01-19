package ch2_Adapter;

public class Math {
    // 두배
    public static double twoTime(double num) {
        return num * 2;
    }

    // 절반
    public static double half(double num) {
        return num / 2;
    }

    // enhanced algorithm
    public static Double doubled(Double d) {
        return d * 2;
    }
}
