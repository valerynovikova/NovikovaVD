
import java.util.Scanner;
public class Contral1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][] arr = new int[n][m];
		int x;
		for (int i = 0; i < n; i++) {
			for (int j = 0; x = m-1; j < m; j++; x--) {
				if(i==j||i == x) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
				System.out.print(" "+ arr[i][j]+ " ");
				
			}
		    System.out.println();
		}
		
	}
}	

			
		
