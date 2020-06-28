import java.util.Scanner;

public class Circle {
    /**
     * Задание 2
     *
     * Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r.
     * Используя формулу πR 2 , вычислите площадь круга и выведите результат на экран.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение радиуса: ");
        double r = scan.nextInt();
        final double PI = 3.1415926535;
        double S = PI * (r * r);
        System.out.println(S);
    }
}
