package Homework6.Task2;

import java.util.Scanner;

public class Author {
    public static void show() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите автора книги: ");
        String author = scan.nextLine();
        System.out.println("Имя автора: " + author);
    }
}
