package ch8_abstractFactory;

public class Direction {
    public static Direction UP;
    public static Direction DOWN;

    public String getDirection(Direction direction){
        if(direction == UP){
            return "up";
        } else if(direction == DOWN){
            return "down";
        }
        return "don't move!";
    }

}
