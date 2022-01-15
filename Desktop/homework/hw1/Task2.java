import java.util.Random;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = in.nextInt();
		int[] ar = new int[x];
		int max = Integer.MIN_VALUE; // -2^31
		for (int i = 0; i < x; i++) {
			ar[i] = new Random().nextInt(101) - 1;
			System.out.print(ar[i] + " ");
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		System.out.println(max);
	}
}          