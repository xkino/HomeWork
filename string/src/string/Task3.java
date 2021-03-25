package string;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        System.out.print("Введите слово:");
        String str = nw.nextLine().trim();
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
//        char[] plain = str.toCharArray();
//        for (int i = plain.length - 1; i >= 0; i--) {
//            reverse.append(plain[i]);
//        }

        System.out.println((reverse.toString().equals(str)) ? "Полиндром" : "Нет");
    }
}
