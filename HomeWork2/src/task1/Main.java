package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
// 1.
        int count = 19;
        if (count<=100 && count>=90) System.out.println("Отлично");
        else if (count<90 && count>=60) System.out.println("Хорошо");
        else if (count<60 && count>=40) System.out.println("Удовлетворительно");
        else if (count<40 && count>=0) System.out.println("попробуйте в следующий раз");

    }
}
