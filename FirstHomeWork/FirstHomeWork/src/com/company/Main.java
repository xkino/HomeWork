package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Даны переменные типа long start и end.
//        Если start меньше end между присвоить значение end - start, в противном случае -1
        long start = 1L;
        long end = 100L;
        long result = (start < end) ? end - start : -1;
        System.out.println(result);

//Найти сумму цифр 2х значного числа
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите двухзнвчное число: ");
//        int num = in.nextInt();
        int num = 35;
        int firstNum = num%10;
        int secondNum = num/10;
        int thirdNum;
        int res = firstNum + secondNum;

        System.out.println("Сумму цифр 2х значного числа " + num + " ровна " + res);

//Найти сумму цифр 3х значного числа
        num = 354;
        firstNum = num%10;
//        num /=10;
        secondNum = num%100/10;
//        num /=10;
        thirdNum = num/100;

//        System.out.println(firstNum);
//        System.out.println(secondNum);
//        System.out.println(thirdNum);
        System.out.println("сумму цифр 3х значного числа " + num + " ровна " + (firstNum + secondNum + thirdNum));
    }
}
