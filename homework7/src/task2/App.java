package task2;

public class App {
    public static void main(String[] args) {
//        System.out.println(Randoms.getRandomInt(2));

        Pets pets1 = new Pets("Корова1", 10, 10, 10,true,true);
        Pets pets2 = new Pets("Кролик", 10, 20, 10,true,false);

        Farmer farmer = new Farmer("Фермер");

        WildAnimal wildAnimal1 = new WildAnimal("Волк", 5, 15, 5);
        WildAnimal wildAnimal2 = new WildAnimal("Медведь", 10, 11, 20);
        WildAnimal wildAnimal3 = new WildAnimal("Рысь", 5, 20, 8);

        Farm farm = new Farm(farmer, new Pets[]{pets1, pets2}, new WildAnimal[]{wildAnimal1, wildAnimal2, wildAnimal3});
        for (int i = 0; i < 10; i++) {
            farm.passDay();
        }

    }
}
