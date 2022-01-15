import java.util.Random;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int[][] ar = new int[x][y];
		int max = Integer.MIN_VALUE;
		int c = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				ar[i][j] = new Random().nextInt(100) + 1;
				System.out.print(ar[i][j] + " ");
				if (max == ar[i][j]) {
					c++;
				}
				if (max < ar[i][j]) {
					c = 1;
					max = ar[i][j];
				}
			    }
				System.out.println();
	        }
			System.out.println(max + " " + c);
		}
	}
}