package task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int numPlates;
        double numFairy;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество тарелок: ");
        numPlates = in.nextInt();
        System.out.println("Введите количество моющего средства: ");
        numFairy = in.nextDouble();

        int i = 0;
        double j = 0;
        while (i < numPlates && (numFairy - j) > 0.5){
            i++;
            j+=0.5;
            System.out.println("Fairy осталось " + ((numFairy - j) < 0 ? 0 : (numFairy - j)));
        }

        if(i == numPlates) {
//            System.out.println("Fairy осталось " + (numFairy - j));
        }
        else System.out.println("Тарелок осталось " + (numPlates - i));

    }

}
