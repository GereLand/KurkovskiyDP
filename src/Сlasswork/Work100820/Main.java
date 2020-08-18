package Classwork.Work100820;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int N = scan.nextInt();
        int[] array = new int[N];
        int x = 1;
        for (int y = 0; y < N; x++, y++) {
            System.out.print("Значение массива в ячейке №" + x + " = ");
            array[y] = scan.nextInt();
        }

        plusNumber(array);
        sumNumber(array);

    }

    private static void plusNumber(int[] array) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] > 0) {
                System.out.print("Первое положительное число: " + array[index]);
                break;
            }
        }

    }

    private static void sumNumber(int[] array) {

        int sumPlusNumber = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > 0 && array[index] % 2 == 0) {
                sumPlusNumber += array[index];
            }
        }

        System.out.println();
        System.out.println("Сумма положительных чисел = " + sumPlusNumber);

    }

}

/*
Решение задачи с условием вывода всех положительных чисел, а не только одного.

    private static void sumNumber(int[] array) {

        int sumPlusNumber = 0;

        System.out.print("Положительные числа: ");
        for (int index = 0; index < array.length; index++) {
            if (array[index] > 0 && array[index] % 2 == 0) {
                sumPlusNumber += array[index];
                System.out.print(array[index] + " ");
            }

        }

        System.out.println();
        System.out.println("Сумма положительных чисел = " + sumPlusNumber);

    }
 */