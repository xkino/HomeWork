public class Load implements Command {
    private final String name = "Загрузить игру";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void execute(int num) {
        int numPrg;
        numPrg = SaveFIOS.loadFile();
        Start start = new Start();
        start.execute(numPrg);
    }
}
