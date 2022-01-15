//возможно 7 но походу нет
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Random rd = new Random();
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt();
        }
        scan(array);
        System.out.println(Arrays.toString(array));

    }

    public static void scan(int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i+1] > array[i] && array[i+1] > array[i+2] && ((array[i+1] % 2) == 0) ) {
                flag = true;
            }
        }
        System.out.println(flag);
    }

}