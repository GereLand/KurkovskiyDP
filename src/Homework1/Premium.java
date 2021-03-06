package Homework1;

import java.util.Scanner;

public class Premium {
    /**
    Задание 6
    Используя IntelliJ IDEA, создайте класс Homework1.Premium.
    Напишите программу расчета начисления премий сотрудникам. Премии рассчитываются согласно выслуге лет.
    Если выслуга до 5 лет, премия составляет 10% от заработной платы.
    Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
    Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
    Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
    Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
    Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
    Результаты расчета, выведите на экран.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер заработной платы: ");
        int zp = scan.nextInt();
        System.out.print("Введите выслугу лет: ");
        int times = scan.nextInt();
        if (times < 5) {
            System.out.print(zp * 110 / 100);
        } if (times >= 5 && times < 10) {
            System.out.print(zp * 115 / 100);
        } if (times >= 10 && times < 15) {
            System.out.print(zp * 125 / 100);
        } if (times >= 15 && times < 20) {
            System.out.print(zp * 135 / 100);
        } if (times >= 20 && times < 25) {
            System.out.print(zp * 145 / 100);
        } if (times >= 25) {
            System.out.print(zp * 150 / 100);
        }
    }
}
