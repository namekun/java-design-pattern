package ch1_strategyPattern.example;

public class Sword implements Weapon {

    @Override
    public void attack(){
        System.out.println("휙휙!");
    }

}
