import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter k");
		int k = scanner.nextInt();
		
		System.out.println("enter m");
		int m = scanner.nextInt();
		
		System.out.println("numbers divisible by three : ");
		if (k< m) {
			for(int i = k; i < m; i++) {
				if (i % 3 == 0) {
					System.out.println(i);
				}
			}
		} else {
			for (int i=m; i < k; i++) {
				if (i % 3 ==0) {
					System.out.println(i);
				}
			}
		}
	}
}