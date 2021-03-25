package string;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = nw.nextLine().trim();
        System.out.print("Введите подстроку поиска: ");
        String str2 = nw.nextLine().trim();
        int index = 0, count = 0;
        while (index <= str1.length()){
            int i = str1.indexOf(str2, index);
            if(i != -1){
                index = i + str2.length();
                count++;
            } else break;
        }
        System.out.println("Подстрока \"" + str2 + "\" встречается в строке \"" + str1 + "\" " + count + " раз.");

    }
}
