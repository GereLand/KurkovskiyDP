package Homework1;

public class DeMorganComparison {
    /**
     *Задание 2
     *Используя IntelliJ IDEA, создайте класс Homework1.DeMorganComparison.
     *Используя теорему Де Моргана, преобразуйте исходное выражение A | B, в эквивалентное выражение.
     */
    public static void main(String[] args) {


//  Решение (???):
//  A | B → A & B
//  A + B → A * B


    }
}

/*
               Список эквивалентных выражений:
         Исходное выражение		Эквивалентное выражение
              !A && !B		=        !(A || B)
              !A && B		=	     !(A || !B)
              A && !B 		=   	!(!A || B)
              A && B		=		!(!A || !B)
              !A || !B		=        !(A && B)
              !A || B		=        !(A && !B)
              A || !B		=       !(!A && B)
              A || B		=		!(!A && !B)
 */