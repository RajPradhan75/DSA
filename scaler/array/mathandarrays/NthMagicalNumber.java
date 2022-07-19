package datastructures.src.com.scaler.array.mathandarrays;

public class NthMagicalNumber {

	public static void main(String[] args) {
		int A = 3;

		System.out.println(solve(A));
	}

	public static int solve(int A) {

		int pow = 1, ans = 0;

		while (A != 0) {
			pow *= 5;

			if ((A & 1) == 1)
				ans += pow;

			A >>= 1;

		}

		return ans;
	}

}
