public class Exit implements Command{
    private final String name = "Выйти";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void execute(int num) {
        System.out.println("Выход");
        return;
    }
}
