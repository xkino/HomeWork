package task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int start = 1, end = 100, conceived, answer;

        Scanner in = new Scanner(System.in);

        System.out.println("Загадайте число от 1 до 100");
        conceived = in.nextInt();

        while (end > start) {
            int mid = (start + end) / 2;
            System.out.println("Число равно " + mid);
            answer = in.nextInt();
            if (answer == 0) {
                System.out.println("Число больше " + mid);
                answer = in.nextInt();
                if (answer == 1) {
                    start = mid;
                } else {
                    System.out.println("Число меньше " + mid);
                    answer = in.nextInt();
                    if (answer == 1) {
                        end = mid;
                    }
                }
            } else {    // Угадали
                System.out.println(mid);
                break;
            }

//            if (mid < conceived) {
//                start = mid;
//            } else if (mid > conceived) {
//                end = mid;
//            } else {
//                System.out.println(mid);
//                break;
//            }
        }
    }
}

