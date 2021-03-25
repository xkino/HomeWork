package string;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n = 3;
        String[] wordsArr = new String[n];
        Scanner nw = new Scanner(System.in);
        n = 0;

        while (n < wordsArr.length) {
            System.out.print("Введите слово: ");
            String newWord = nw.nextLine().trim();

            if (newWord.equalsIgnoreCase("exit")) break;

            if (searchWord(newWord, wordsArr) == 0) {
                wordsArr[n] = newWord;
                n++;
                System.out.println(newWord + " добавлено в массив.");
            } else {
                System.out.println("Слово \"" + newWord + "\" уже есть в массиве.");
            }
        }

        System.out.println(Arrays.toString(wordsArr));

    }

    public static int searchWord(String word, String[] arr) {
        if (word == null) {
            return 0;
        }

        if (word.equals("")) {
            return 0;
        }

        for (String wordArr : arr) {
            if (wordArr == null) continue;
            if (wordArr.equals(word)) {
                return 1;
            }
        }

        return 0;
    }
}
