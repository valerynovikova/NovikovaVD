import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar1 = new int[n];
		int[] ar2 = new int[n];
		int[] ar3 = new int[n];
		for (int i = 0; i < n; i++) {
			ar1[i] = new Random().nextInt(101) + 1;
			ar2[i] = new Random().nextInt(101) + 1;
			ar3[i] = ar1[i] + ar2[i];
		}
		System.out.println(Arrays.toString(ar3));
	}
}
