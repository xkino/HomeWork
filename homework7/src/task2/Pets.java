package task2;

// Домашние животные
public class Pets extends Animals {
    private int health;
    private final int maxHealth;
    private final boolean forFood;
    private final boolean resources;

    public Pets(String name, int weight, int speed, int health, boolean forFood, boolean resources) {
        super(name, weight, speed);
        this.health = health;
        this.maxHealth = health;
        this.forFood = forFood;
        this.resources = resources;
    }

    public int getResourcesCount() {
        if (!resources) return 0;
        if (!isAlive()) return 0;
        return this.getWeight();
    }

    //  Домашнее животное может убежать
    public boolean ranAway(WildAnimal wildAnimal) {
        if (wildAnimal == null) {
            throw new IllegalArgumentException("wildAnimals = null");
        }
        if(speed > wildAnimal.speed){
            System.out.println(this.toString() + " убежал");
        }
        return speed > wildAnimal.speed;
    }

    //  Домашнее животное живое
    public boolean isAlive() {
        return health > 0;
    }

    //  Домашнее животное для еды
    public boolean isForFood() {
        return forFood;
    }

    //  Домашнее животное может восполнять здоровье на 1
    public void increaseHealth() {
        if (!isAlive()) return;
        health = Math.min(health + 1, maxHealth);
    }

    // Отнимаем количество очков здоровья
    public void minusHealth(int countHealth) {
        if (!isAlive()) return;
        health = Math.max(0, health - countHealth);
        if (health == 0) {
            System.out.println("Съели " + this.toString());
        }
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", health=" + health +
                ", forFood=" + forFood +
                ", resources=" + resources +
                '}';
    }
}
