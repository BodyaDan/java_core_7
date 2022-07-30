package fly.simulator;

public abstract class Plane {
    double lenght;
    double weight;
    double width;

    public Plane(double lenght, double width, double weight) {
        this.lenght = lenght;
        this.weight = weight;
        this.width = width;
    }

    public void startEngine() {
        int time = (int) (20 + Math.random() * 88);
        System.out.println("The plane will be ready to start for " + time + "s");
    }

    public void takingOff() {
        double distance = (Math.random() * 1000);
        System.out.println("Plane is take offing now. It can fly " + distance + "km without any refueling");
    }

    abstract void landing();

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
