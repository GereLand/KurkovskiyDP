package Homework5;

import java.util.Scanner;

public class CustomerArray {
    /**
     * Задание 1
     * <p>
     * Требуется:
     * Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
     * массива задает пользователь).
     * Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму
     * всех элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
     */
    // Использую лишний раз дополнительные методы, для того чтобы лучше разбираться в их работе, прошу прощение!
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int N = scan.nextInt();
        int[] mas = new int[N];
        int x = 1;
        for (int y = 0; y < N; ) {
            System.out.print("Значение в массиве в ячейке №" + x + " = ");
            mas[y] = scan.nextInt();
            x++;
            y++;
        }
        System.out.println("\n" + "Наибольшее значение массива = " + maximum(mas));
        System.out.println("Наименьшее значение массива = " + minimum(mas));
        System.out.println("Общая сумма всех элементов массива = " + summa(mas));
        odd(mas);
        System.out.printf("\n" + "Среднее арифметическое значение всех элементов массива = " + ("%-10.2f%n%n"), average(mas));
    }

    static int maximum(int[] mas) {
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];
        }
        return max;
    }

    static int minimum(int[] mas) {
        int min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min)
                min = mas[i];
        }
        return min;
    }

    static int summa(int[] mas) {
        int sum = mas[0];
        for (int i = 1; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        return sum;
    }

    static double average(int[] mas) {
        double sum = mas[0];
        for (int i = 1; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        double ave = sum / mas.length;
        return ave;
    }

    static int odd(int[] mas) {
        System.out.print("Нечётные значения массива: ");
        int num = mas[0];
        if (mas[0] % 2 != 0) {
            System.out.print(mas[0] + " ");
        }

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] % 2 != 0) {
                System.out.print(mas[i] + " ");
            }
        }
        return num;
    }

//    static int odd(int[] mas) {
//        System.out.print("Нечётные значения массива: ");
//        int num = mas[0];
//        if (mas[0] % 2 == 0)
//            System.out.print("");
//        else
//            System.out.print(mas[0] + " ");
//
//
//        for (int i = 1; i < mas.length; i++) {
//            if (mas[i] % 2 == 0) {
//                System.out.print("");
//            } else {
//                System.out.print(mas[i] + " ");
//            }
//        }
//        return num;
//    }
}