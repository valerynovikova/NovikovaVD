import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
			if (ar[i] == 0) {
				flag = true;
			}
		}
		
		System.out.println(flag);
	}
}