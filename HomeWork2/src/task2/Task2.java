package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int num1, num2, num3;
        num1 = input("num1");
        num2 = input("num2");
        num3 = input("num3");
        switch (num3) {
            case 3 -> System.out.println(num1 + num2);
            case 5 -> System.out.println(num1 - num2);
            case 7 -> System.out.println(num1 * num2);
            case 9 -> {
                if (num2 == 0) {
                    System.out.println("Делите на 0?");
                    break;
                }
                System.out.println(num1 / num2);
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
