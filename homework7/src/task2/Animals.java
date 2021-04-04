package task2;

abstract public class Animals {
    protected String name;
    protected int weight;
    protected int speed;

    public Animals(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }
}
