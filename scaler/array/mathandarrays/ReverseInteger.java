package datastructures.src.com.scaler.array.mathandarrays;

public class ReverseInteger {

	public static void main(String[] args) {

		int x = 123;
		System.out.println(reverse(x));

	}

	public static int reverse(int x) {

		int reverse = 0, pop;

		while (x != 0) {

			pop = x % 10;
			x /= 10;

			if (reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && pop < -8)
				return 0;

			if (reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && pop > 7)
				return 0;

			reverse = (reverse * 10) + pop;

		}

		return reverse;
	}

}
