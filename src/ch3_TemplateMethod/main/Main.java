package ch3_TemplateMethod.main;

import ch3_TemplateMethod.dp.AbstractGameConnectHelper;
import ch3_TemplateMethod.dp.DefaultGameConnection;

public class Main {
    public static void main(String[] args) {
        AbstractGameConnectHelper helper = new DefaultGameConnection();
        helper.requestConnection("information");
    }
}
