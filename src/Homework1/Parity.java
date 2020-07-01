package Homework1;

import java.util.Scanner;

public class Parity {
    /**
     Задание 4
     Известно, что у четных чисел младший бит имеет значение 0
     Используя IntelliJ IDEA, создайте класс Homework1.Parity.
     Напишите программу, которая будет выполнять проверку чисел на четность.
     Предложите два варианта решения поставленной задачи.
 */
    /*
    public static void main(String[] args) {
//        Первый вариант решения.

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите посимвольно восьмизначное число в двоичной системе, слева направо!");
        System.out.print("Введите первую цифру: ");
        int number1 = scan.nextInt();
        System.out.print("Введите вторую цифру: ");
        int number2 = scan.nextInt();
        System.out.print("Введите третью цифру: ");
        int number3 = scan.nextInt();
        System.out.print("Введите четвёртую цифру: ");
        int number4 = scan.nextInt();
        System.out.print("Введите пятую цифру: ");
        int number5 = scan.nextInt();
        System.out.print("Введите шестую цифру: ");
        int number6 = scan.nextInt();
        System.out.print("Введите седьмую цифру: ");
        int number7 = scan.nextInt();
        System.out.print("Введите восьмую цифру: ");
        int number8 = scan.nextInt();
        System.out.println("Ваше введённое число: ");
        System.out.print(number1);
        System.out.print(number2);
        System.out.print(number3);
        System.out.print(number4);
        System.out.print(" ");
        System.out.print(number5);
        System.out.print(number6);
        System.out.print(number7);
        System.out.println(number8);
        if (number8 == 0) {
            System.out.println("Введённое число является чётным.");
        } else {
            System.out.println("Введённое число является нечётным.");
        }
    }
    */
    public static void main(String[] args) {
//      Второй вариант решения

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите посимвольно восьмизначное число в двоичной системе, слева направо!");
        System.out.print("Введите первую цифру: ");
        int number1 = scan.nextInt();
        System.out.print("Введите вторую цифру: ");
        int number2 = scan.nextInt();
        System.out.print("Введите третью цифру: ");
        int number3 = scan.nextInt();
        System.out.print("Введите четвёртую цифру: ");
        int number4 = scan.nextInt();
        System.out.print("Введите пятую цифру: ");
        int number5 = scan.nextInt();
        System.out.print("Введите шестую цифру: ");
        int number6 = scan.nextInt();
        System.out.print("Введите седьмую цифру: ");
        int number7 = scan.nextInt();
        System.out.print("Введите восьмую цифру: ");
        int number8 = scan.nextInt();
        System.out.println("Ваше введённое число: ");
        System.out.print(number1);
        System.out.print(number2);
        System.out.print(number3);
        System.out.print(number4);
        System.out.print(" ");
        System.out.print(number5);
        System.out.print(number6);
        System.out.print(number7);
        System.out.println(number8);
        int numberIn10 = (number1 * 128) + (number2 * 64) + (number3 * 32) + (number4 * 16) + (number5 * 8) + (number6 * 4) + (number7 * 2) + number8;
//        int numberIn10 = (number1 * (2 ^ 7)) + (number2 * (2 ^ 6)) + (number3 * (2 ^ 5)) + (number4 * (2 ^ 4)) + (number5 * (2 ^ 3)) + (number6 * (2 ^ 2)) + (number7 * (2 ^ 1)) + number8;
//        Почему то программа не захотела правильно считать в этом варианте, видимо я делаю что то неправильно и она не умеет так возводить в степень, поэтому заменил на захардкоженные цифры.
        if (numberIn10 % 2 == 0) {
            System.out.println("Введённое число (в десятичной системе " + numberIn10 + ") является чётным.");
        } else {
            System.out.println("Введённое число (в десятичной системе " + numberIn10 + ") является нечётным.");
        }
    }
}
