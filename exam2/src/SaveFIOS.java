import java.io.*;

public class SaveFIOS {
    public static void saveFile(int num) {
        try (FileOutputStream fos = new FileOutputStream("save.txt")) {
            byte[] buffer = (Integer.toString(num)).getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("Игра сохранена");
    }

    public static int loadFile() {
        int result = 0;
        try (FileInputStream fin = new FileInputStream("save.txt")) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            result = Integer.parseInt(new String(buffer, "UTF-8"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }
}
