package com.company;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        int[] ints = {-321, 894, -45, 782, -29, 12, -88};
        for (int p : ints) {
            if (p < 0) count++;
        }

        int[] negative = new int[count];
        for (int i = 0, j = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                negative[j] = ints[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(negative));
    }
}
