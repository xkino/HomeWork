package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int num = 0, conceived, start = 1, end = 9;

        Scanner in = new Scanner(System.in);
        conceived = start + (int) (end * Math.random());

        while (num != conceived) {
            num = input("num");

            if (num == 0) {
                System.out.println("Закрываем");
                break;
            } else if (num == conceived) {
                System.out.println("Вы угадали!!!");
                break;
            } else if (num > conceived) {
                System.out.println("Загаданное число меньше");
                continue;
            } else if (num < conceived) {
                System.out.println("Загаданное число больше");
                continue;
            }
        }
    }


    public static int input(String name) {

        System.out.println("Введите " + name);
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        return num;
    }

}
