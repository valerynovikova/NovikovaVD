import java.util.Random;
import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] ar = {2,45,67,89,4,5,23,66,77,88};
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i] % 2 == 0 && ar[i] > 0) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	}
}