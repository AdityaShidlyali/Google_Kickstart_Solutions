import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int tc = input.nextInt();
		
		for (int t = 1; t <= tc; t++) {

			int n = input.nextInt();
			int k = input.nextInt();

			String str = input.next();
			
			int count = 0;
			for (int i = 0; i < n/2; i++) {
				if(str.charAt(i) != str.charAt(n-i-1))
					count++;
			}
			
			System.out.println("Case #" + t + ": " + (Math.abs(k-count)));
		}
		
		input.close();
	}
}