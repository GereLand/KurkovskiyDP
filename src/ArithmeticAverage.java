import java.util.Scanner;

public class ArithmeticAverage {
    /**
     * Задание 1
     * <p>
     * Вычислите среднее арифметическое трех целочисленных значений и выведите его на экран.
     * С какой проблемой вы столкнулись? Какой тип переменных лучше использовать для корректного
     * отображения результата?
     */
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение переменной А: ");
        int a = scan.nextInt();
        System.out.print("Введите значение переменной В: ");
        int b = scan.nextInt();
        System.out.print("Введите значение переменной С: ");
        int c = scan.nextInt();
        int sum = (a + b + c) / 3;
        System.out.print("Среднее арифметическое значение введённых переменных равно " + sum);
    }*/
/*
Корректнее использовать тип переменных int, для работы только с целочисленными значениями.
Однако, ответ может быть округлён после деления, а значит он будет не точен, однако задание подразумевает округление до
целочисленного значения.
 */
/*
Для разнообразия замутил метод в котором можно вносить значение переменных с плавающей точкой, но при расчётах среднего
арифметического значения эти переменные будут округляться. Важно не забыть сказать программе, что мы знаем о потере
точности вычислений и возможном изменении значений при трансформации из double в int.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение переменной А: ");
        double a = scan.nextDouble();
        System.out.print("Введите значение переменной В: ");
        double b = scan.nextDouble();
        System.out.print("Введите значение переменной С: ");
        double c = scan.nextDouble();
        int sum = (int) ((a + b + c) / 3);
        System.out.print("Среднее арифметическое значение введённых переменных равно " + sum);
    }
}
