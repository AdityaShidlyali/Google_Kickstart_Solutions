import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int tc = input.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			int n = input.nextInt();
			int b = input.nextInt();
			
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			
			Arrays.sort(a);
			int sum = 0, count = 0;
			for (int i = 0; i < n; i++) {
				sum += a[i];
				if (sum  <= b) {
					count++;
				} else {
					break;
				}
			}
			
			System.out.println("Case #" + t + ": " + count);
		}
		
		input.close();
	}
}