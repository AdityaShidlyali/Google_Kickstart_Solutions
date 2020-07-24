import java.util.Scanner;

public class Solution2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int tc = input.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			int n = input.nextInt();
			
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			
			int count = 0;
			for (int i = 0; i < n-1; i++) {
				if (a[i-1] < a[i] && a[i+1] < a[i]) {
					count++;
				}
			}
			
			System.out.println("Case #" + t + ": " + count);
		}
		
		input.close();
	}
}