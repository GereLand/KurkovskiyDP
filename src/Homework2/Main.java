package Homework2;

public class Main {
    /**
     * Задание 4
     *
     * Проверьте, можно ли создать переменные со следующими именами:
     * uberflu? , _Identifier , \u006fIdentifier , &myVar , myVariab1le
     */
    public static void main(String[] args) {
//    int uberflu? = 1; // //Невозможно создать данную переменную - компилятор ругается

    int _Identifier = 2; //Возможно создать данную переменную

//    int \u006fIdentifier = 3; //Создать переменную возможно и даже можно вывести её значение,
        // но программа ругается на такое название. Судя по всему лучше такое не использовать.

//    int &myVar = 4; //Невозможно создать данную переменную - компилятор ругается

    int myVariab1le = 5; //Возможно создать данную переменную

//        System.out.println(uberflu?);
        System.out.println(_Identifier);
//        System.out.println(\u006fIdentifier);
//        System.out.println(&myVar);
        System.out.print(myVariab1le);
    }
}
