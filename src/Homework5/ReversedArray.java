package Homework5;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {
    /**
     * Задание 2
     * <p>
     * Требуется:
     * 1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
     * целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
     * порядке).
     * 2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает часть
     * полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
     * размерностью, которая соответствует значению аргумента count.
     * Если аргумент count содержит значение больше чем количество элементов, которые входят в
     * выбираемую часть исходного массива (от указанного индекса index, до индекса последнего
     * элемента), то при формировании нового массива размерностью в count, заполните единицами те
     * элементы, которые не были скопированы из исходного массива.
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
        myReverse(array);
        System.out.print("Задайте значение index: ");
        int index = scan.nextInt();
        System.out.print("Задайте значение count: ");
        int count = scan.nextInt();
        subArray(array, index, count);
    }

    public static int[] myReverse(int[] array) {
        System.out.println("Первоначальный массив : " + Arrays.toString(array));
        if (array == null || array.length <= 1) {
            System.out.println("Заданный массив невозможно перевернуть!");
            return array;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Перевёрнутый массив : " + Arrays.toString(array));
        return array;
    }

    public static int[] subArray(int[] array, int index, int count) {
        System.out.print("Видоизменённый массив: [");
        for (int i = index; i < (index + count); i++) {
            // if я сделал заковыристым просто для единообразия вывода с предыдущими массивами. Люблю когда всё красиво.
            if (i < array.length)
                System.out.print(array[i] + ", ");
            else if (i != (index + count -1))
                System.out.print(1 + ", ");
            else
                System.out.print(1);
        }
        System.out.print("]");
        return array;
    }
}
