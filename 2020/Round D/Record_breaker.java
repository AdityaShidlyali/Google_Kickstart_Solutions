import java.util.Scanner;

public class Solution1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int tc = input.nextInt();
		
		for (int t = 1; t <= tc; t++) {
			int n = input.nextInt();
			
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			
			if (n == 1) {
				System.out.println("Case #" + t + ": " + 1);
			} else {
				int max = a[0], count = 0;
				
				for (int i = 0; i < n; i++) {
					if (i == 0) {
						if (a[i] > a[i+1]) {
							count++;
						}
					}
					else if (i == n-1) {
						if (a[i] > max) {
							count++;
						}
					}
					else if (a[i] > max) {
						max = a[i];
						if (a[i] > a[i+1]) {
							count++;
						}
					}
					else {
						assert i > n : "flase";
					}
				}
				
				System.out.println("Case #" + t + ": " + count);
			}
		}
		input.close();
	}
}