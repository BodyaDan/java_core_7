package fly.simulator;

public class Application {
    public static void main(String[] args) {
        SU27 su27 = new SU27(21.9, 14.7, 16380, 2100, "dark-green");

        su27.startEngine();
        su27.takingOff();
        su27.flyController.moveUp();
        su27.flyController.moveLeft();
        su27.flyController.moveRight();
        su27.flyController.moveDown();
        su27.stelsTechnology();
        su27.nukeAtack();
        su27.turbo();
        su27.landing();
    }
}
