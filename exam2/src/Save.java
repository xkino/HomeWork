public class Save implements Command{
    private final String name = "Сохранить и выйти";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void execute(int num) {
        SaveFIOS.saveFile(num);
    }
}
