package Homework3;

import java.util.Scanner;

public class Translator {
    /**
     *Задание 4
     *
     * Напишите программу русско-английский переводчик.
     * Программа знает 10 слов о погоде. Требуется, чтобы пользователь вводил
     * слово на русском языке, а программа давала ему перевод этого слова на
     * английском языке. Если пользователь ввел слово, для которого отсутствует
     * перевод, то следует вывести сообщение, что такого слова нет.
     */
    /*
    Содержание словаря:
    1. Погода - Weather
    2. Ветренно - Windy
    3. Солнечно - Sunny
    4. Холодно - Cold
    5. Морозно - Frosty
    6. Жарко - Hot
    7. Дождливо - Rainy
    8. Тепло - Warm
    9. Облачно - Cloudy
    10. Туман - Fog
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово на русском языке с большой буквы: ");
        String rusWord = scan.next();
        switch (rusWord) {
            case "Погода":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Weather)");
                break;
            case "Ветренно":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Windy)");
                break;
            case "Солнечно":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Sunny)");
                break;
            case "Холодно":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Cold)");
                break;
            case "Морозно":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Frosty)");
                break;
            case "Жарко":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Hot)");
                break;
            case "Дождливо":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Rainy)");
                break;
            case "Тепло":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Warm)");
                break;
            case "Облачно":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Cloudy)");
                break;
            case "Туман":
                System.out.print("Слово (" + rusWord + ") переводится на английский, как (Fog)");
                break;
            default:
                System.out.print("Слово отсутствует в переводчике или введено некорректно.");
                break;
        }
    }
}
