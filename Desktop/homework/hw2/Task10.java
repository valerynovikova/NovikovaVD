//Найти сумму чисел, состоящих из n-го кол-ва единиц)
public class Task10 {
	public static void main(String[] args) {
		int n = scn.nextInt();
		int t = 1, ones = 0;

		for (int i = 0; i < n; i++) {
			ones += t;
			t = t * 10 + 1;
		}
		System.out.print("Sum of Ones = " +ones);
	}
}