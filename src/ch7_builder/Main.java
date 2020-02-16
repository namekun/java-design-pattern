package ch7_builder;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product.ProductBuilder("test", 1000).setIsSellEnabled(true).build();
        Product p2 = new Product.ProductBuilder("test2", 10000).setIsSellEnabled(false).build();
    }
}
