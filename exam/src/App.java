public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Petr", "Vasiliev", 15);
        Person person2 = new Person("Ivan", "Petrov", 14);
        Person person3 = new Person("Stepan", "Ivanov", 14);
        Person person4 = new Person("Svetha", "Ivanova", 16);
        Person person5 = new Person("Gaily", "Petrova", 20);

        Subscription subscription1 = new Subscription(person1, TypeSubscription.DAY);
        Subscription subscription2 = new Subscription(person2, TypeSubscription.FULL);
        Subscription subscription3 = new Subscription(person3, TypeSubscription.ONETIME);
        Subscription subscription4 = new Subscription(person4, TypeSubscription.ONETIME);
        Subscription subscription5 = new Subscription(person5, TypeSubscription.DAY);

        Fitness fitness = new Fitness(20);
        fitness.registration(subscription1, TypeZone.GYM);
        fitness.registration(subscription1, TypeZone.GROUP);
        fitness.registration(subscription2, TypeZone.POOL);
        fitness.registration(subscription3, TypeZone.GYM);
        fitness.registration(subscription4, TypeZone.POOL);
        fitness.registration(subscription5, TypeZone.POOL);
        System.out.println("********************************");
        fitness.info();
        System.out.println("********************************");
        fitness.closeFitness();
    }
}
