package fly.simulator;

public class SU27 extends Plane implements Planeable{
    FlyController flyController = new FlyController();
    int maxSpeed;
    String color;

    public SU27(double lenght, double width, double weight, int maxSpeed, String color) {
        super(lenght, width, weight);
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    void landing() {
        System.out.println("Mission completed! SU-27 is landing.");
    }

    @Override
    public void turbo() {
        int speeding = (int) (maxSpeed + Math.random() * 100);
        System.out.println("Turbo ON. Speed of the plane is " + speeding);
    }

    @Override
    public void stelsTechnology() {
        int time = (int) (10 + Math.random() * 60);
        System.out.println("Stels ON. The plane will be invisible for " + time + "m");
    }

    @Override
    public void nukeAtack() {
        int count = (int) (1 + Math.random() * 10);
        System.out.println("SU-27 is droping " + count + " bombs right now!");
    }
}
