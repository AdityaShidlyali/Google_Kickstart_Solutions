import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = input.nextInt();
			int k = input.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = input.nextInt();
			}
			int countk = 1, count = 0, flag = 0;
			for (int i = 0; i < n - 1; i++) {
				if (i + k - 1 < n) {
					if (a[i + k - 1] == 1) {
						for (int j = i; j < i + k - 1; j++) {
							if (a[j] == a[j + 1] + 1) {
								countk++;
								if (countk == k) {
									count++;
									flag = 1;
								}
							} else {
								break;
							}
						}
					} else {
						continue;
					}
				} else {
					break;
				}
				countk = 1;
				if (flag == 1) {
					i = i + k-1;
				}
				flag = 0;
			}
			System.out.println("Case #" + t + ": " + count);
		}
		input.close();
	}
}