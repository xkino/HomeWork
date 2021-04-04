package task2;

//Дикие животные
public class WildAnimal extends Animals implements Eat {
    private int force;
    private int kickAway = 0;
    private final int maxKickAway = Settings.MAX_KICK_AWAY;

    public WildAnimal(String name, int weight, int speed, int force) {
        super(name, weight, speed);
        this.force = force;
    }

    //  Может напасть
    public boolean canAttack() {
        if(!(kickAway < maxKickAway)){
            System.out.println(this.toString() + " не может напасть");
        }
        return kickAway < maxKickAway;
    }

    //  Дикое животное может съесть
    @Override
    public void eat(Pets pets) {
        if (pets == null) return;
        if (!canAttack()) return;
        if (pets.ranAway(this)) return;
        pets.minusHealth(force);
        System.out.println(this.toString() + " напал на " + pets.toString());
    }

    //  Прогнали дикое животное
    public void addKickAway() {
        kickAway++;
    }

    @Override
    public String toString() {
        return "WildAnimals{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", force=" + force +
                '}';
    }
}
