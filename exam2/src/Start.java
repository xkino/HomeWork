import java.util.Scanner;

public class Start implements Command {
    private final String name = "Начать игру";
    private Scanner in;

    public Start() {
        initialize();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void execute(int num) {
        Paragraph paragraph = new Paragraph(num);
        game(paragraph);
    }

    private void initialize(){
        in = new Scanner(System.in);
    }

    private void game(Paragraph p) {
        if (p.checkParagraph() == -1) {
            System.out.println(p.getText());
            System.out.println("Проиграли.");
            return;
        }

        if (p.checkParagraph() == 1) {
            System.out.println(p.getText());
            System.out.println("Выиграли.");
            return;
        }

        System.out.println(p.toString());
        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (num == 3) {
            Menu menu = new Menu();
            menu.addCommand(new Save());
            menu.showMenu(in, p.getNumber());
            return;
        }

        switch (num) {
            case 1: {
                Paragraph paragraph1 = new Paragraph(p.getAnswer1());
                game(paragraph1);
                break;
            }
            case 2: {
                Paragraph paragraph2 = new Paragraph(p.getAnswer2());
                game(paragraph2);
                break;
            }
            default: {
                System.out.println("Нет такого варианта.");
                break;
            }
        }

    }
}

