package Homework6.Task2;

import java.util.Scanner;

public class Title {
    public static void show() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String title = scan.nextLine();
        System.out.println("Название книги: " + title);
    }
}
