package fly.simulator;

public class FlyController {
    public void moveUp() {
        int distance = (int) (10 + Math.random() * 50);
        System.out.println("The plane is moving up by " + distance + "km");
    }
    public void moveDown() {
        int distance = (int) (10 + Math.random() * 50);
        System.out.println("The plane is moving down by " + distance + "km");
    }
    public void moveLeft() {
        int distance = (int) (10 + Math.random() * 50);
        System.out.println("The plane is moving left by " + distance + "km");
    }
    public void moveRight() {
        int distance = (int) (10 + Math.random() * 50);
        System.out.println("The plane is moving right by " + distance + "km");
    }
}
