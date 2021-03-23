package com.company;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int end = 20, count = 0;
        if (end % 2 == 0) {
            count = end / 2;
        } else count = end / 2 + end % 2;

        int[] ints = new int[count];
        for (int i = 0; i < ints.length; i++) {
            if (end % 2 == 0) {
                ints[i] = end / (ints.length) * (i + 1);
            } else {
                ints[i] = (end / (ints.length) + 1) * i + 1;
            }
        }

        System.out.println(Arrays.toString(ints));

        for (int i = (ints.length - 1); i >= 0; i--) {
            if (i == (ints.length - 1)) System.out.print("[");
            if (i == 0) {
                System.out.print(ints[i]);
                System.out.print("]");
            } else System.out.print(ints[i] + ", ");

        }

    }
}
