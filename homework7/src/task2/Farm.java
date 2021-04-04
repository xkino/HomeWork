package task2;

public class Farm {
    private Farmer farmer;
    private Pets[] pets;
    private WildAnimal[] wildAnimals;

    public Farm(Farmer farmer, Pets[] pets, WildAnimal[] wildAnimals) {
        this.farmer = farmer;
        this.pets = pets;
        this.wildAnimals = wildAnimals;
    }

    public void passDay() {
        if (farmer.getCountResources() < Settings.COUNTER_RESOURCES_FOR_GAME) {
            System.out.println("Конце игры.");
            return;
        }
        System.out.println("Начало");
        farmer.minusResources(Settings.COUNTER_RESOURCES_FOR_GAME);
        WildAnimal wildAnimal = wildAnimals[Randoms.getRandomInt(wildAnimals.length)];
        if (Randoms.getRandomInt(2) == 0) {
            farmer.kickAway(wildAnimal);
        } else {
            Pets pet = pets[Randoms.getRandomInt(pets.length)];
            if (pet.isAlive()) {
                wildAnimal.eat(pet);
            }
        }
        boolean noResources = true;
        for (int i = 0; i < pets.length; i++) {
            farmer.feed(pets[i]);
            farmer.takeResources(pets[i]);
            if (noResources) {
                noResources = (pets[i].getResourcesCount() == 0);
            }
        }
        if (noResources) {
            for (int i = 0; i < pets.length; i++) {
                if (pets[i].isAlive()) {
                    farmer.eat(pets[i]);
                }
            }
        }
        System.out.println("Ресурсов собрано " + farmer.getCountResources());
        System.out.println("Конец-----------");
    }


}
