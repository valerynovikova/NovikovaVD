/ из к в 10
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong;
		long n = 0;
		int b = 1;
		for(int k = 2; k <=9; k++) {
			while (x > 0) {
			long d = x % 10;
			n = n + b * d;
			b = b * k;
			x = x / 10;
			}
		}
		System.out.println(n);
		
	}
}