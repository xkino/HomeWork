package com.company;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int start = -1, end = 1, swap;
        int[] ints = new int[11];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * (end - start)) + start;
        }
        System.out.println(Arrays.toString(ints));

        int index = 0, frequency = 0, frequencyMax = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    frequency++;
                }

            }
            if (frequency > frequencyMax) {
                frequencyMax = frequency;
                index = i;
            }
            frequency = 0;
        }

        System.out.println("Самый часто встречающийся элемент " + ints[index]);
        System.out.println("Встречается " + frequencyMax + " раз.");
    }
}
