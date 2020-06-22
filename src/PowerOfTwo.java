import java.util.Scanner;

public class PowerOfTwo {
    /*
    public static void main(String[] args) {
        //Этот метод применим к восьмизначному числу двоичной системы, но вот я подумал, что есть числа степени двойки выше,
        //поэтому напишу что то более универсальное, а это совершенно неэлегантное решение, мне жаль удалять.

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
        System.out.print(number1);
        System.out.print(number2);
        System.out.print(number3);
        System.out.print(number4);
        System.out.print(" ");
        System.out.print(number5);
        System.out.print(number6);
        System.out.print(number7);
        System.out.println(number8);
        int sum = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8;
        if(sum == 1) {
            System.out.println("Введённое число является степенью двойки!");
        }   else {
            System.out.println("Введённое число не является степенью двойки :(");
        }
    }
     */
    public static void main(String[] args) {
//      Данное решение принято на основании, что все числа степени двойки в десятичном формате, имеют лишь одну единицу в двоичной системе счисления.
//      Из всех возможных вариантов, мне показался этот самый простой, если я правильно понял задание
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в двоичной системе: ");
        int number = scan.nextInt();
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        if(sum == 1) {
            System.out.println("Введённое число является степенью двойки ;)");
        }   else {
            System.out.println("Введённое число не является степенью двойки :(");
        }
    }
}

/*
        Задание 1
        Известно, что у чисел, которые являются степенью двойки, только один бит имеет значение 1.
        Используя IntelliJ IDEA, создайте класс PowerOfTwo.
        Напишите программу, которая будет выполнять проверку – является ли указанное число степенью двойки или нет.
 */