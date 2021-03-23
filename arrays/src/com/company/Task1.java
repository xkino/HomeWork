package com.company;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int start = 3, end = 500, indexMax = 0, indexMin = 0, swap;
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * (end - start)) + start;
            if (ints[i] > ints[indexMax]) {
                indexMax = i;
            }
            if (ints[i] < ints[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(ints[indexMax]);
        System.out.println(ints[indexMin]);

        swap = ints[indexMax];
        ints[indexMax] = ints[indexMin];
        ints[indexMin] = swap;

        System.out.println(Arrays.toString(ints));
    }

}
