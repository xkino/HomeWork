import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Menu {
    Map<Integer, Command> commands = new TreeMap<>();

    public Menu() {
        initialize();
    }

    private void initialize() {
        commands.put((commands.size() + 1), new Start());
        commands.put((commands.size() + 1), new Load());
        commands.put((commands.size() + 1), new Exit());
    }

    public void addCommand(Command command) {
        Command lastCommand = commands.get(commands.size());
        commands.put((commands.size()), command);
        commands.put((commands.size() + 1), lastCommand);
    }

    public void deleteCommand(Command command) {

    }

    public void showMenu(Scanner in, int numParagraph) {
        System.out.println(toString());
        System.out.println("Input a number: ");
        int num = in.nextInt();
        Command cmd = commands.get(num);
        cmd.execute(numParagraph);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Command> item : commands.entrySet()) {
            sb.append(item.getKey().toString() + ". " + item.getValue().toString() + "\n");
        }

        return sb.toString();
    }
}
