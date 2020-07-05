package Homework3;

import java.util.Scanner;

public class Calculator {
    /**
     * Задание 2
     * <p>
     * Напишите программу – консольный калькулятор. Создайте две переменные с
     * именами operand1 и operand2.
     * Задайте переменным некоторые произвольные значения. Предложите
     * пользователю ввести знак арифметической операции. Примите
     * значение, введенное пользователем и поместите его в строковую переменную
     * sign . Для организации выбора алгоритма вычислительного процесса,
     * используйте переключатель switch . Выведите на экран результат выполнения
     * арифметической операции. В случае использования операции деления,
     * организуйте проверку попытки деления на ноль. И если таковая имеется, то
     * отмените выполнение арифметической операции и уведомите об ошибке
     * пользователя .
     */
    // Вариант выполнения задания согласно условиям.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1 = 10;
        int operand2 = 5;
        System.out.print("Введите знак арифметической операции: ");
        String sign = scan.next();
        switch (sign) {
            case "+":
                System.out.print("Результат вычисления = " + (operand1 + operand2));
                break;
            case "-":
                System.out.print("Результат вычисления = " + (operand1 - operand2));
                break;
            case "*":
                System.out.print("Результат вычисления = " + (operand1 * operand2));
                break;
            case "/":
            // Не нашёл другого способа сделать исключение в switch, поэтому использовал if
                if (operand2 != 0)
                System.out.print("Результат вычисления = " + (operand1 / operand2));
                else System.out.println("Невозможно произвести операцию деления на ноль!");
                break;
            default:
                System.out.print("Введено некорректное значение!");
                break;
        }
    }
    // Вариант выполнения задания с использованием ручного введения операндов в консоль.
    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение переменной А: ");
        int operand1 = scan.nextInt();
        System.out.print("Введите знак арифметической операции: ");
        String sign = scan.next();
        System.out.print("Введите значение переменной В: ");
        int operand2 = scan.nextInt();
        switch (sign) {
            case "+":
                System.out.print("Результат вычисления = " + (operand1 + operand2));
                break;
            case "-":
                System.out.print("Результат вычисления = " + (operand1 - operand2));
                break;
            case "*":
                System.out.print("Результат вычисления = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0)
                    System.out.print("Результат вычисления = " + (operand1 / operand2));
                else System.out.println("Невозможно произвести операцию деления на ноль!");
                break;
            default:
                System.out.print("Введено некорректное значение!");
                break;
        }
    }
     */
}