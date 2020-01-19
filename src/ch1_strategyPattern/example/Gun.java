package ch1_strategyPattern.example;

public class Gun implements Weapon {

    @Override
    public void attack(){
        System.out.println("빵야빵야");
    }

}
