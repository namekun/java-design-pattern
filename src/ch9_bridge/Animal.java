package ch9_bridge;

public class Animal {
    private Hunting_Handler hunt;
    public Animal(Hunting_Handler hunt){
        this.hunt = hunt;
    }

    public void Find_Quarry(){
        hunt.Find_Quarry();
    }

    public void Detected_Quarry(){
        hunt.Detected_Quarry();
    }

    public void Attack(){
        hunt.attack();
    }

    public void hunt(){
        Find_Quarry();
        Detected_Quarry();
        Attack();
    }
}
