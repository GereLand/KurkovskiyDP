package Homework6.Task1;

import java.util.Scanner;

public class Rectangle {
    /**
     * Задание 1
     * Используя IDEA, создайте проект c пакетом.
     * Требуется: Создать класс с именем Rectangle.
     * В теле класса создать два поля, описывающие длины сторон double side1,
     * double side2.
     * Создать два метода, вычисляющие площадь прямоугольника – double
     * areaCalculator (double side1, double side2) и периметр прямоугольника –
     * double perimeterCalculator (double side1, double side2).
     * Написать программу, которая принимает от пользователя длины двух сторон
     * прямоугольника и выводит на экран периметр и площадь.
     */
    // Не понял момента с созданием проекта с пакетом, учитывая, что решение подразумевает использование одного класса.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение длины прямоугольника: ");
        double side1 = scan.nextDouble();
        System.out.print("Введите значение ширины прямоугольника: ");
        double side2 = scan.nextDouble();
        System.out.println("Площадь прямоугольника = " + areaCalculator(side1, side2));
        System.out.println("Периметр прямоугольника = " + perimeterCalculator(side1, side2));
    }

    public static double areaCalculator (double side1, double side2) {
        double area = side1 * side2;
        return area;
    }

    public static double perimeterCalculator (double side1, double side2) {
        double perimeter = 2 * (side1 + side2);
        return perimeter;
    }
}
