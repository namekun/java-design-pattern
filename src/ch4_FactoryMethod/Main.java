package ch4_FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("이순신");
        Product card2 = factory.create("장보고");
        Product card3 = factory.create("아무개");

        card1.use();
        card2.use();
        card3.use();
    }
}
