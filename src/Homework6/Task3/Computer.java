package Homework6.Task3;

import java.util.Scanner;

public class Computer {
    /**
     * Задание 3
     * Используя IDEA, создайте проект с пакетом.
     * Создать класс Computer, создать массив объектов Computers размером 5.
     * Далее руками создать 5 экземпляров этого класса и записать в компьютер
     * (используя loop)
     */
    // Предварительно сделал так, оно работает, но я бы хотел сделать через экземпляры класса, но пока не понял, как это
    // работает с массивами.

    private static String[] computers = new String[5];

    public static void main(String[] args) {
//
//        Computer computer1 = new Computer();
////        Computer.computers[0] = computer1;
//        Computer computer2 = new Computer();
//        Computer computer3 = new Computer();
//        Computer computer4 = new Computer();
//        Computer computer5 = new Computer();

        Scanner scan = new Scanner(System.in);

        for (int index = 0; index < computers.length; index++) {
            switch (index) {
                case 0:
                    System.out.print("Введите данные компьютера №1: ");
                    computers[0] = scan.nextLine();
                    break;
                case 1:
                    System.out.print("Введите данные компьютера №2: ");
                    computers[1] = scan.nextLine();
                    break;
                case 2:
                    System.out.print("Введите данные компьютера №3: ");
                    computers[2] = scan.nextLine();
                    break;
                case 3:
                    System.out.print("Введите данные компьютера №4: ");
                    computers[3] = scan.nextLine();
                    break;
                case 4:
                    System.out.print("Введите данные компьютера №5: ");
                    computers[4] = scan.nextLine();
                    break;
            }
        }

        Show(computers);
    }

    private static void Show(String[] computers) {

        System.out.println("Данные всех компьютеров: ");
        for (String computer : computers) {
            System.out.println(computer);
        }

    }
}