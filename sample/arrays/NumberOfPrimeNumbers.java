package datastructures.src.com.sample.arrays;

public class NumberOfPrimeNumbers {

	public static void main(String[] args) {

		int N = 100;

		for (int i = 1; i <= N; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isPrime(int n) {

		int count = 0;

		for (int i = 2; i <= n; i++) {

			if (n % i == 0) {
				if (n / i == 0)
					count++;
				else
					count += 2;
			}
		}

		if (count == 2)
			return true;
		else
			return false;
	}

}
