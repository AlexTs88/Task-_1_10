import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
        элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
         */
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        size = sc.nextInt();
        sc.close();
        int[] a = new Random().ints(size, 1, 10).toArray();
        System.out.println("Исходный массив: " + Arrays.toString(a));

        for (int i = 2, j = 1; i < a.length; i += 2, j ++) {
            a[j] = a[i];
        }

        int x;
        if (a.length % 2 == 0) {
            x = a.length / 2;
        } else x = a.length / 2 + 1;

        for (int i = x; i < a.length; i ++) {
            a[i] = 0;
        }
        System.out.println("Измененный массив: " + Arrays.toString(a));
    }
}
