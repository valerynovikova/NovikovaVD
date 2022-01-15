import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double g1;

		if (n > 0) {
			double squareRoot = n / 2;
		do {
			g1 = squareRoot;
			squareRoot = (g1 + n/g1)/2;
		} while ((g1-squareRoot) != 0);	
		System.out.printf("The square root = %.6f", squareRoot);
		} else if (n < 0) {
			System.out.print("The square root of a negative number is not extracted");
		} else if (n == 0) {
			System.out.printf("The square root of number = " +0);
		}
	}
}