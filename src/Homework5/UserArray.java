package Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {
    /**
     * Задание 3
     * <p>
     * Требуется:
     * Создать метод, который будет выполнять увеличение длины массива переданного в качестве
     * аргумента, на 1 элемент. Элементы массива, должны сохранить свое значение и порядок
     * индексов.
     * Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй
     * аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
     * метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент,
     * а элементы получаемого массива в качестве первого аргумента должны скопироваться в новый
     * массив начиная с индекса 1.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте размер массива: ");
        int N = scan.nextInt();
        int[] array = new int[N];
        int x = 1;
        for (int y = 0; y < N; ) {
            System.out.print("Значение в массиве в ячейке №" + x + " = ");
            array[y] = scan.nextInt();
            x++;
            y++;
        }
        System.out.print("Задайте значение аргумента value: ");
        int value = scan.nextInt();
        System.out.println("Увеличенный массив : " + Arrays.toString(increasingLengthArray(array)));
        System.out.println("Изменённый массив : " + Arrays.toString(magicInArray(array, value)));
    }

    public static int[] increasingLengthArray(int[] array1) {
        System.out.println("Первоначальный массив : " + Arrays.toString(array1));
        int[] array2 = new int[array1.length + 1];
        System.arraycopy(array1, 0, array2, 0, array1.length);
        return array2;
        // В задаче не стоит присвоение новой ячейке массива какого-либо значения, поэтому не стал заморачиваться.
    }

    public static int[] magicInArray(int[] array, int value) {
        int[] array3 = new int[array.length + 1];
        System.arraycopy(array, 0, array3, 1, array.length);
        array3[0] = value;
        return array3;
    }
}
