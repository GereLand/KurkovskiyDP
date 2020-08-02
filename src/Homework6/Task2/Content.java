package Homework6.Task2;

import java.util.Scanner;

public class Content {
    public static void show() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите содержание книги: ");
        String content = scan.nextLine();
        System.out.println("Содержание: " + content);
    }
}
