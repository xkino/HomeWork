package com.company;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int even = 0, uneven = 0;
        int[] ints = {78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90};
//  Определим размерность
        for (int elemArr : ints) {
            if (elemArr % 2 == 0) {
                even++;
            } else uneven++;
        }
//  Создадим массивы
        int[] arrEven = new int[even];
        int[] arrUneven = new int[uneven];
//  Заполним массивы
        for (int i = 0, j = 0, n = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                arrEven[j] = ints[i];
                j++;
            } else {
                arrUneven[n] = ints[i];
                n++;
            }
        }
        Arrays.sort(arrEven);
        Arrays.sort(arrUneven);
        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrUneven));
    }
}
