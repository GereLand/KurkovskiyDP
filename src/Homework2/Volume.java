package Homework2;

import java.util.Scanner;

public class Volume {
    /**
     * Задание 3
     * <p>
     * Напишите программу расчета объема - V и площади поверхности -S цилиндра.
     * Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR 2 h
     * Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR 2 + 2πR 2 = 2πR(R+h)
     * Результаты расчетов выведите на экран.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение радиуса цилиндра: ");
        int R = scan.nextInt();
        System.out.print("Введите значение высоты цилиндра: ");
        int h = scan.nextInt();
        final double PI = Math.PI;
        double V = (PI * (R ^ 2)) * h;
        double S = (2 * PI * R) * (R + h);
        System.out.println();
        System.out.println("Значение объёма цилиндра равно " + V);
        System.out.println("Если значение округлить, то " + (int) V);
        System.out.println();
        System.out.println("Значение площади поверхности цилиндра равно " + S);
        System.out.println("Если значение округлить, то " + (int) S);
    }
}
