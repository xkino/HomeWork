import java.time.LocalDateTime;

public class Subscription {
    private Person person;
    private LocalDateTime startRegistration;
    private LocalDateTime endRegistration;
    private TypeSubscription typeSubscription;

    public Subscription(Person person, TypeSubscription typeSubscription) {
        this.person = person;
        this.typeSubscription = typeSubscription;
    }

    public void setEndRegistration(LocalDateTime endRegistration) {
        if (endRegistration.isBefore(startRegistration)) {
            throw new IllegalArgumentException("Конец регистрации не может быть позже начала.");
        }
        this.endRegistration = endRegistration;
    }

    public void setStartRegistration() {
        this.startRegistration = LocalDateTime.now();
    }

    public LocalDateTime getStartRegistration() {
        return startRegistration;
    }

    public TypeSubscription getTypeSubscription() {
        return typeSubscription;
    }

    public String infoSubscription() {
        return "Абонемент {" +
                person.toString() +
                '}';
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "person=" + person.toString() +
                ", startRegistration=" + startRegistration +
                ", endRegistration=" + endRegistration +
                ", typeSubscription=" + typeSubscription +
                '}';
    }
}

