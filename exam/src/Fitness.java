import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Fitness {
    private Subscription[][] subscriptions;

    public Fitness(int count) {
        TypeZone[] typeZones = TypeZone.values();
        subscriptions = new Subscription[typeZones.length][count];
    }

    public void registration(Subscription subscription, TypeZone typeZone) {
        if (checkTime(subscription)) {
            System.out.println("Время посещения не соответствует абонементу.");
            return;
        }
        if (checkTypeZone(subscription, typeZone)) {
            System.out.println("Зона посещения не соответствует абонементу.");
            return;
        }
        switch (addSubscription(subscription, typeZone)) {
            case 0:
                System.out.println(infoSubscriptionFitness(subscription, typeZone));
                break;
            case 1:
                return;
            case 2:
                System.out.println("Нет свободных мест.");
                return;
        }
    }

    private boolean checkTime(Subscription subscription) {
        TypeSubscription typeSubscription = subscription.getTypeSubscription();
        LocalTime timeRegistration = LocalTime.now();
        int hour = timeRegistration.getHour();
        if (typeSubscription == TypeSubscription.DAY) {
            if (hour < 8 && hour > 16) {
                return true;
            }
        }
        if (typeSubscription == TypeSubscription.ONETIME || typeSubscription == TypeSubscription.FULL) {
            if (hour < 8 && hour > 22) {
                return true;
            }
        }
        return false;
    }

    private boolean checkTypeZone(Subscription subscription, TypeZone typeZone) {
        TypeSubscription typeSubscription = subscription.getTypeSubscription();
        TypeZone[] typeZones = typeSubscription.getTypeZones();
        for (TypeZone e : typeZones) {
            if (e == typeZone) {
                return false;
            }
        }
        return true;
    }

    private int addSubscription(Subscription subscription, TypeZone typeZone) {
        for (int i = 0; i < subscriptions.length; i++) {
            for (int j = 0; j < subscriptions[i].length; j++) {
                if (subscriptions[i][j] == subscription) {
                    TypeZone[] typeZones = TypeZone.values();
                    System.out.println("Зарегистрирован в " + typeZones[i].toString());
                    return 1;
                }
                if (subscriptions[i][j] == null && typeZone.ordinal() == i) {
                    subscriptions[i][j] = subscription;
                    subscription.setStartRegistration();
                    return 0;
                }
            }
        }

        return 2;
    }

    public void closeFitness() {
        for (int i = 0; i < subscriptions.length; i++) {
            for (int j = 0; j < subscriptions[i].length; j++) {
                if (subscriptions[i][j] == null) continue;
                subscriptions[i][j].setEndRegistration(LocalDateTime.now());
                subscriptions[i][j] = null;
            }
        }
    }

    public void info() {
        for (int i = 0; i < subscriptions.length; i++) {
            for (int j = 0; j < subscriptions[i].length; j++) {
                if (subscriptions[i][j] == null) continue;
                System.out.println(subscriptions[i][j].toString());
            }
        }
    }

    private String infoSubscriptionFitness(Subscription subscription, TypeZone typeZone) {
        StringBuilder sb = new StringBuilder(subscription.infoSubscription());
        sb.append("; Зона - " + typeZone.toString());
        sb.append("; Время посещения - " + subscription.getStartRegistration().toString());
        return sb.toString();
    }
}
