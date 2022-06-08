package datastructures.src.com.scaler.array.general;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t;
		for (t = 0; t < n; t++) {
			int m = sc.nextInt();
			int sum = 0;
			int i = 1;
			while (i < m) {
				if (m % i == 0) {
					sum = sum + i;
				}
				i++;
			}
			if (sum == m) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
	}

}
