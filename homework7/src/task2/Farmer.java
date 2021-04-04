package task2;

public class Farmer implements Eat {
    private String name;
    private int countResources;

    public Farmer(String name) {
        this.name = name;
        countResources = Settings.START_COUNTER_RESOURCES;
    }

    public int getCountResources() {
        return countResources;
    }

    //  собрать ресурсы с домашних животных
    public void takeResources(Pets pets) {
        if (pets == null) return;
        if (!pets.isAlive()) return;
        countResources += pets.getResourcesCount();
    }

    //кормить домашнее животное
    public void feed(Pets pets) {
        if (pets == null) return;
        pets.increaseHealth();
    }

    public void minusResources(int count) {
        if (countResources > 0) {
            countResources = Math.max(0, countResources - count);
        }
    }

    //    прогнать дикое животное
    public void kickAway(WildAnimal wildAnimal) {
        if (wildAnimal == null) return;
        wildAnimal.addKickAway();
        System.out.println("Прогнал " + wildAnimal.toString());
    }

    // съесть домашнее животное
    @Override
    public void eat(Pets pets) {
        if (pets == null) return;
        if (!pets.isForFood() && pets.isAlive()) return;
        countResources += pets.getWeight();
        pets.minusHealth(pets.getWeight());
        System.out.println("Фермер съел " + pets.toString());
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", countResources=" + countResources +
                '}';
    }
}
